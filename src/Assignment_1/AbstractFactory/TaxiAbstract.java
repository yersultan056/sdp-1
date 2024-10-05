package Assignment_1.AbstractFactory;


import Assignment_1.AbstractFactory.Drivers.DriverAbstract;

public abstract class TaxiAbstract {
    private DriverAbstract driver;
    private String license;

    public TaxiAbstract(DriverAbstract driver, String license) {
        this.driver = driver;
        this.license = license;
    }

    public abstract void takePassenger(String passenger);

    public void driveTaxi() {
        driver.drive();
    }
}
