package Assignment_1.AbstractFactory.Drivers;

public abstract class DriverAbstract {
    private String name;

    public DriverAbstract(String name) {
        this.name = name;
    }

    public abstract void drive();
}
