package Assignment_3.Task4;

public class Demo {
    public static void main(String[] args) {
        DispatcherMediator mediator = new DispatcherMediator();

        Dispatcher dispatcher = new Dispatcher(mediator);
        Client client1 = new Client("Client1", mediator);
        Driver driver1 = new Driver("Driver1", mediator);

        client1.requestRide();
    }
}
