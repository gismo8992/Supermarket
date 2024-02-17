package interfaces;

/**
 * Интерфейс для методов движения покупателя в очереди.
 */
public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor); // добавление клиента в очередь
    public void releaseFromQueue(); // удаление клиента из очереди
    public void takeOrder(); // формирования заказа клиентом в магазине
    public void giveOrder(); // получение заказа клиентом в магазине
}
