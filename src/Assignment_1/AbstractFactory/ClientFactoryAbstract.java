package Assignment_1.AbstractFactory;


public class ClientFactoryAbstract {
    public static void main(String[] args) {
        FactoryAbstract factory = new StandardFactoryAbstract();
        TaxiAbstract taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Dwayne Johnson");

        factory = new PremiumFactoryAbstract();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Kendrick Lamar");
    }
}
