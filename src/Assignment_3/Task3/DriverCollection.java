package Assignment_3.Task3;

import java.util.ArrayList;
import java.util.List;

public class DriverCollection implements Collection {
    private List<Driver> drivers = new ArrayList<>();

    public DriverCollection(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public Iterator getIterator() {
        return new DriverIterator(drivers);
    }
}
