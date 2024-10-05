package Assignment_1.Factory;

public class StandardTaxi extends Taxi {
    public StandardTaxi(String driverName, String license) {
        super(driverName, license);
    }

    @Override
    public void takePassenger(String passenger) {
        System.out.println("Just a regular ride for passenger " + passenger);
    }
}
