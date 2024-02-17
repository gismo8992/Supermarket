package classes;

import interfaces.iActorBehaviour;

/**
 * Класс описывает структуру инспектора. Является тайным клиентом.
 */
public class TaxInspector implements iActorBehaviour{
    private String name;
    private boolean isTakeOrder; // флаг состояния - инспектор получил заказ
    private boolean isMakeOrder; // флаг состояния - инспектор сделал заказ

    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    /**
     * Метод возвращает экземпляр обычного клиента при запросе экземпляра класса налогового инспектора.
     * @return экземпляр класса обычного клиента с именем по умолчанию "Тайный клиент".
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient("Тайный клиент");
    }

    /**
     * Метод для получения переменной флага состояния сделанного заказа клиентом
     *
     * @return Флаг состояния - клиент сделал или не сделал заказ
     */
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Метод для получения переменной флага состояния полученного заказа клиентом
     *
     * @return Флаг состояния - клиент получил или не получил заказ
     */
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Метод для установления флага состояния сделанного заказа клиентом
     *
     * @param isCreated Переменная состояния заказа у клиента - сделан или не сделан
     */
    public void setMakeOrder(boolean isCreated) {
        isMakeOrder = isCreated;
    }

    /**
     * Метод для установления флага состояния полученного заказа клиентом
     *
     * @param isCreated Переменная состояния заказа у клиента - получен или не получен
     */
    public void setTakeOrder(boolean isCreated) {
        isTakeOrder = isCreated;
    }
}
