package Assignment_3.Task4;

public class Dispatcher {
    private Mediator mediator;

    public Dispatcher(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDispatcher(this);
    }

    public void assignDriver(Driver driver, Client client) {
        System.out.println("Assigning driver " + driver.getName() + " to client " + client.getName());
        driver.confirmRide();
    }
}