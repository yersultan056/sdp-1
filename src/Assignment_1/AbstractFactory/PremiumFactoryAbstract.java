package Assignment_1.AbstractFactory;

import Assignment_1.AbstractFactory.Drivers.DriverAbstract;
import Assignment_1.AbstractFactory.Drivers.PremiumDriver;

public class PremiumFactoryAbstract extends FactoryAbstract {
    @Override
    public TaxiAbstract createTaxi(String driverName, String license) {
        DriverAbstract driver = new PremiumDriver(driverName);
        return new PremiumTaxiAbstract(driver, license);
    }
}
