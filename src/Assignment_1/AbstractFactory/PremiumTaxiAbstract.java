package Assignment_1.AbstractFactory;


import Assignment_1.AbstractFactory.Drivers.DriverAbstract;

public class PremiumTaxiAbstract  extends TaxiAbstract {
    public PremiumTaxiAbstract(DriverAbstract driver, String license) {
        super(driver, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Premium ride on RollsRoyce for passenger " + passenger);
    }
}
