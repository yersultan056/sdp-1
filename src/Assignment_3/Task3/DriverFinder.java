package Assignment_3.Task3;

public class DriverFinder {

    public static Driver findClosestDriver(DriverCollection driverCollection, double clientX, double clientY) {
        Iterator iterator = driverCollection.getIterator();
        Driver closestDriver = null;
        double minDistance = Double.MAX_VALUE;

        while (iterator.hasNext()) {
            Driver currentDriver = (Driver) iterator.next();
            double distance = currentDriver.calculateDistance(clientX, clientY);

            if (distance < minDistance) {
                minDistance = distance;
                closestDriver = currentDriver;
            }
        }

        return closestDriver;
    }
}
