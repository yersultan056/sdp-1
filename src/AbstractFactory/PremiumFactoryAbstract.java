package AbstractFactory;

import AbstractFactory.Drivers.DriverAbstract;
import AbstractFactory.Drivers.PremiumDriver;

public class PremiumFactoryAbstract extends FactoryAbstract {
    @Override
    public TaxiAbstract createTaxi(String driverName, String license) {
        DriverAbstract driver = new PremiumDriver(driverName);
        return new PremiumTaxiAbstract(driver, license);
    }
}
