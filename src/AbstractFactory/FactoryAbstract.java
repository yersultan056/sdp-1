package AbstractFactory;

public abstract class FactoryAbstract {
    public abstract TaxiAbstract createTaxi(String driverName, String license);
}
