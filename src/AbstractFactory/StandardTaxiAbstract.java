package AbstractFactory;

import AbstractFactory.Drivers.DriverAbstract;
import Prototype.Driver;

public class StandardTaxiAbstract  extends TaxiAbstract {
    public StandardTaxiAbstract(DriverAbstract driver, String license) {
        super(driver, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Just a regular ride for passenger " + passenger);
    }
}
