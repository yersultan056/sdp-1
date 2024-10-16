package Assignment_3.Task4;

public class Client {
    private String name;
    private Mediator mediator;

    public Client(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerClient(this);
    }

    public String getName() {
        return name;
    }

    public void requestRide() {
        mediator.requestRide(this);
    }
}
