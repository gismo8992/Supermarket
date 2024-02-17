package classes;

/**
 * Класс описывает структуру привилегированного клиента.
 */
public class SpecialClient extends Actor {
    private int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    /**
     * Метод для получения флага состояния сделанного заказа клиентом
     *
     * @return Флаг состояния - клиент сделал или не сделал заказ
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод для получения флага состояния полученного заказа клиентом
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
     * Метод получения экземпляра привилегированного клиента.
     *
     * @return возвращает экземпляр привилегированного клиента.
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Метод получения имени привилегированного клиента.
     *
     * @return возвращает имя привилегированного клиента
     */
    @Override
    String getName() {
        return super.name;
    }

    /**
     * Метод присвоения имени привилегированного клиента
     *
     * @param name задаваемое имя привилегированного клиента.
     */
    @Override
    void setName(String name) {
        super.name = name;
    }
}
