package Assignment_1.AbstractFactory;


import Assignment_1.AbstractFactory.Drivers.DriverAbstract;
import Assignment_1.AbstractFactory.Drivers.StandardDriver;

public class StandardFactoryAbstract extends FactoryAbstract {
    @Override
    public TaxiAbstract createTaxi(String driverName, String license) {
        DriverAbstract driver = new StandardDriver(driverName);
        return new StandardTaxiAbstract(driver, license);
    }
}
