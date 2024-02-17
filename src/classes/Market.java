package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.iActorBehaviour;
import interfaces.iMarketBehaviour;
import interfaces.iQueueBehaviour;

/**
 * Класс описывает работу магазина.
 * Методы класса работают с клиентами, которые представляют собой экземпляры классов, наследующихся от абстрактного класса
 * Actor, который реализует интерфейс iActorBehaviour. Экземпляры клиентов передаются в класс магазина в свойство в виде списка.
 * Структура класса позволяет следующие операции с клиентами:
 * - фиксировать приход клиентов в магазин;
 * - добавлять клиентов в очередь;
 * - проверять клиентов на наличие сделанного заказа;
 * - выдавать заказ;
 * - удалять клиента из очереди после получения заказа;
 * - фиксировать уход клиента из магазина.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {
    private List<iActorBehaviour> queue; // список для хранения клиентов

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод фиксирует приход клиента в магазин, выполняет постановку клиента в очередь в магазине.
     *
     * @param actor клиент для добавления в очередь в магазине.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод фиксирует клиентов, которые покинули магазин.
     *
     * @param actors список клиентов, покинувших очередь в магазине.
     */
    @Override
    public void releaseFromMarket(@org.jetbrains.annotations.NotNull List<iActorBehaviour> actors) {
        for (iActorBehaviour actor : actors) {
            System.out.println(actor.getActor().getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Метод добавляет клиента в очередь в магазине.
     *
     * @param actor клиент для добавления в очередь в магазине.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод показывает клиентов, которые получили заказ, покинули очередь и магазин.
     */
    @Override
    public void releaseFromQueue() {
        List<iActorBehaviour> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод выдачи заказа клиенту магазином.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                // Реализация отказа в обслуживании пока не работает.
//                if (actor instanceof ActionClient) {
//                    if (((ActionClient) actor).getId() < ActionClient.getAmountOfActionClient()) {
//                        System.out.println("Превышено количество участников акции. Обслуживание недоступно.");
//                    }
//                }
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Метод формирования заказа клиентом в магазине
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }
    }

    /**
     * Метод выполнения действий клиента по формированию заказа, получению заказа и выходу из очереди и магазина.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}
