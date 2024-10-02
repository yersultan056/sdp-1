package Factory;

public abstract class Taxi {
    private String driverName;
    private String license;

    public Taxi(String driverName, String license) {
        this.driverName = driverName;
        this.license = license;
    }

    public abstract void takePassenger(String passenger);

}
