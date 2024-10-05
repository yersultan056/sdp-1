package Assignment_1.AbstractFactory.Drivers;

public class PremiumDriver extends DriverAbstract {
    public PremiumDriver(String driverName) {
        super(driverName);
    }

    @Override
    public void drive() {
        System.out.println("Driver with comfort");
    }
}
