package Assignment_3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Driver1", 5, 5));
        drivers.add(new Driver("Driver2", 1, 1));
        drivers.add(new Driver("Driver3", 3, 3));

        DriverCollection driverCollection = new DriverCollection(drivers);

        double clientX = 2;
        double clientY = 2;

        Driver closestDriver = DriverFinder.findClosestDriver(driverCollection, clientX, clientY);

        System.out.println("The closest driver: " + closestDriver.getName());
    }
}
