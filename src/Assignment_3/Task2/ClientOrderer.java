package Assignment_3.Task2;

public class ClientOrderer {
    public static void main(String[] args) {
        TaxiManager manager = new TaxiManager();

        TaxiClient client = new TaxiClient(
                new CreateOrderCommand(manager),
                new CancelOrderCommand(manager),
                new ChangeDestinationCommand(manager)
        );

        manager.createOrder();
        manager.changeDestination();
        manager.cancelOrder();
    }
}
