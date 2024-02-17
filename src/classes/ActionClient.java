package classes;

import interfaces.iReturnOrder;

/**
 * Класс описывает структура акционного клиента.
 */
public class ActionClient extends Actor {
    private int id;
    private static int amountOfActionClient; // количество участников акции
    private String nameOfAction; // название акции

    public ActionClient(String name, int id) {
        super(name);
        this.id = id;
    }

    /**
     * Метод для получения флага состояния полученного заказа клиентом
     *
     * @return Флаг состояния - клиент получил или не получил заказ
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод для получения флага состояния сделанного заказа клиентом
     *
     * @return Флаг состояния - клиент сделал или не сделал заказ
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод для установления флага состояния полученного заказа клиентом
     *
     * @param isCreated Переменная состояния заказа у клиента - получен или не получен
     */
    @Override
    public void setTakeOrder(boolean isCreated) {
        this.isTakeOrder = isCreated;
    }

    /**
     * Метод для установления флага состояния сделанного заказа клиентом
     *
     * @param isCreated Переменная состояния заказа у клиента - сделан или не сделан
     */
    @Override
    public void setMakeOrder(boolean isCreated) {
        this.isMakeOrder = isCreated;
    }

    /**
     * Метод получения экземпляра акционного клиента.
     *
     * @return возвращает экземпляр акционного клиента.
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * Метод получения имени акционного клиента.
     *
     * @return возвращает имя акционного клиента
     */
    @Override
    String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени акционного клиента
     *
     * @param name задаваемое имя акционного клиента.
     */
    @Override
    void setName(String name) {

    }

    /**
     * Метод возвращает id клиента.
     *
     * @return id клиента
     */
    public int getId() {
        return id;
    }

    /**
     * Метода устанавливает id клиента.
     *
     * @param id для присвоения id клиенту.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод возвращает количество участников акции.
     *
     * @return количество участников акции
     */
    public static int getAmountOfActionClient() {
        return amountOfActionClient;
    }

    /**
     * Метод задает количество участников акции.
     *
     * @param amountOfActionClient количество участников акции.
     */
    public static void setAmountOfActionClient(int amountOfActionClient) {
        ActionClient.amountOfActionClient = amountOfActionClient;
    }

    /**
     * Метод возвращает название акции.
     *
     * @return название акции
     */
    public String getNameOfAction() {
        return nameOfAction;
    }

    /**
     * Метод задает название акции.
     *
     * @param nameOfAction название акции
     */
    public void setNameOfAction(String nameOfAction) {
        this.nameOfAction = nameOfAction;
    }

    /**
     * Метод показывает, является ли клиент участником текущей акции.
     */
    public void showCurrentAction() {
        if (id <= amountOfActionClient) {
            System.out.println("Клиент " + super.name + " c id:" + this.id + " участвует в акции " + this.nameOfAction);
        } else
            System.out.println("Клиент " + super.name + " c id:" + this.id + " не участвует в акции " + this.nameOfAction);
    }
}
