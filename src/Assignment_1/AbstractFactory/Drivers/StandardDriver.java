package Assignment_1.AbstractFactory.Drivers;

public class StandardDriver extends DriverAbstract {
    public StandardDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driver regularly");
    }
}
