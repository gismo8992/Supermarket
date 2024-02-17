package interfaces;

import classes.Actor;

/**
 * Интерфейс описывает поведение всех видов клиентов.
 */
public interface iActorBehaviour {
    public boolean isTakeOrder(); // возвращает свойство с текущим статусом получения заказа клиента
    public boolean isMakeOrder(); // возвращает свойство с текущим статусом формирования заказа клиента
    public void setTakeOrder(boolean isCreated); // установка флага получения заказа клиента
    public void setMakeOrder(boolean isCreated); // установка флага формирования заказа клиента
    public Actor getActor(); // получение экземпляра клиента
}
