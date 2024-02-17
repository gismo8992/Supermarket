package classes;

/**
 * Класс описывает структуру обычного клиента.
 */
public class OrdinaryClient extends Actor {
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Метод для получения переменной флага состояния сделанного заказа клиентом
     *
     * @return Флаг состояния - клиент сделал или не сделал заказ
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод для получения переменной флага состояния полученного заказа клиентом
     *
     * @return Флаг состояния - клиент получил или не получил заказ
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод для установления флага состояния сделанного заказа клиентом
     *
     * @param isCreated Переменная состояния заказа у клиента - сделан или не сделан
     */
    public void setMakeOrder(boolean isCreated) {
        super.isMakeOrder = isCreated;
    }

    /**
     * Метод для установления флага состояния полученного заказа клиентом
     *
     * @param isCreated Переменная состояния заказа у клиента - получен или не получен
     */
    public void setTakeOrder(boolean isCreated) {
        super.isTakeOrder = isCreated;
    }

    /**
     * Метод получения экземпляра обычного клиента.
     *
     * @return возвращает экземпляр обычного клиента.
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Метод получения имени обычного клиента.
     *
     * @return возвращает имя обычного клиента
     */
    @Override
    String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени обычного клиента
     *
     * @param name задаваемое имя обычного клиента.
     */
    @Override
    void setName(String name) {
        super.name = name;
    }
}
