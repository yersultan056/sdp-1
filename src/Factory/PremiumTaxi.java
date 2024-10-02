package Factory;

public class PremiumTaxi extends Taxi {
    public PremiumTaxi(String driverName, String license) {
        super(driverName, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Premium ride on RollsRoyce for passenger " + passenger);
    }
}