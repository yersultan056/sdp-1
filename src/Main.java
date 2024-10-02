import AbstractFactory.FactoryAbstract;
import AbstractFactory.PremiumFactoryAbstract;
import AbstractFactory.StandardFactoryAbstract;
import AbstractFactory.TaxiAbstract;
import Builder.Driver2;
import Factory.Factory;
import Prototype.Driver;
import Singleton.DriverManager;
import Singleton.LazyDoubleChecked.LazyDoubleDriverManager;
import Singleton.Passenger;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Passenger passenger = new Passenger();
        DriverManager driverManager = DriverManager.getInstance();
        String driver = driverManager.findNearestDriver("Location A");
        passenger.assignTaxi(driver);
        System.out.println("===================================");

        //Task 1.1*
        LazyDoubleDriverManager driverManager1 = LazyDoubleDriverManager.getInstance();
        LazyDoubleDriverManager driverManager2 = LazyDoubleDriverManager.getInstance();
        String driver2 = driverManager1.findNearestDriver("Location A");
        System.out.println("Driver found: " + driver2);
        System.out.println("===================================");

        //Task 2
        Driver originalDriver = new Driver("John Doe", "Toyota Prius");
        System.out.println("Original Driver: " + originalDriver.getName());
        System.out.println("Original Driver’s car: " + originalDriver.getCarModel());

        Driver clonedDriver = (Driver) originalDriver.clone();
        clonedDriver.setName("Jane Doe");
        System.out.println("Cloned Driver: " + clonedDriver.getName());
        System.out.println("Cloned Driver’s car: " + clonedDriver.getCarModel());
        System.out.println("===================================");

        //Task 3
        Driver2 driver3 = new Driver2.DriverBuilder()
                .withName("Johny Silverhand")
                .withCarModel("Porshe 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();
        System.out.println(driver3);
        System.out.println("===================================");

        //Task 4
        //Factory factory = new StandardTaxiFactory();
        //Taxi taxi = factory.createTaxi("Daniele", "XYZ12345");
        //taxi.takePassenger("Baiken Ashimov");

        //factory = new PremiumTaxiFactory();
        //taxi = factory.createTaxi("Daniele", "XYZ12345");
        //taxi.takePassenger("Bella Irving");
        //System.out.println("===================================");

        //Task 5
        FactoryAbstract factory = new StandardFactoryAbstract();
        TaxiAbstract taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Dwayne Johnson");

        factory = new PremiumFactoryAbstract();
        taxi = factory.createTaxi("Daniele", "XYZ12345");
        taxi.takePassenger("Kendrick Lamar");
        System.out.println("===================================");
    }
}