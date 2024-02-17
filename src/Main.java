import classes.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Толя");
        Actor client2 = new OrdinaryClient("Оля");
        Actor client3 = new SpecialClient("Президент", 777);
        TaxInspector client4 = new TaxInspector();
        ActionClient client5 = new ActionClient("Ivan", 4);
        ActionClient.setAmountOfActionClient(6);
        client5.setNameOfAction("10% all sale");
        client5.showCurrentAction();
        client5.setNameOfAction("15% snack");
        ActionClient.setAmountOfActionClient(3);
        client5.showCurrentAction();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();
        client2.returnOrder();
    }

}