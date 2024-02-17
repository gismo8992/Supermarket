package classes;

import interfaces.iActorBehaviour;

import interfaces.iReturnOrder;

/**
 * Класс описывает структуру абстрактного клиента.
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isMakeOrder; // флаг состояния - клиент сделал заказ
    protected boolean isTakeOrder; // флаг состояния - клиент получил заказ

    public Actor(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает имя клиента.
     *
     * @return имя клиента.
     */
    abstract String getName();

    /**
     * Метод задает имя клиенту.
     *
     * @param name задаваемое имя клиента.
     */
    abstract void setName(String name);

    public void returnOrder() {
        if (isTakeOrder) {
            System.out.println(this.getName() + " клиент вернул заказ ");
            this.setTakeOrder(false);
        }
    }
}
