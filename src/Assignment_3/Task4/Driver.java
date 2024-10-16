package Assignment_3.Task4;

public class Driver {
    private String name;
    private Mediator mediator;

    public Driver(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.registerDriver(this);
    }

    public String getName() {
        return name;
    }

    public void confirmRide() {
        mediator.confirmRide(this);
    }
}
