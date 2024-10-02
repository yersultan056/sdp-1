package AbstractFactory;

import AbstractFactory.Drivers.DriverAbstract;
import AbstractFactory.Drivers.StandardDriver;

public class StandardFactoryAbstract extends FactoryAbstract {
    @Override
    public TaxiAbstract createTaxi(String driverName, String license) {
        DriverAbstract driver = new StandardDriver(driverName);
        return new StandardTaxiAbstract(driver, license);
    }
}
