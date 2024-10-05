package Assignment_1.AbstractFactory;

import Assignment_1.AbstractFactory.Drivers.DriverAbstract;

public class StandardTaxiAbstract  extends TaxiAbstract {
    public StandardTaxiAbstract(DriverAbstract driver, String license) {
        super(driver, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Just a regular ride for passenger " + passenger);
    }
}
