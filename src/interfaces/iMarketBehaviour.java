package interfaces;

import java.util.List;

import classes.Actor;

/**
 * Интерфейс для методов входа в магазин и выхода из магазина.
 */
public interface iMarketBehaviour {
    public void acceptToMarket(iActorBehaviour actor); // вход клиента в магазин

    public void releaseFromMarket(List<iActorBehaviour> actors); // выход клиента из магазина

    public void update(); // выполнение действий клиента по получению заказа и выходу из очереди и магазина
}

