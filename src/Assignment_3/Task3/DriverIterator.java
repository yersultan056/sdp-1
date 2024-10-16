package Assignment_3.Task3;

import java.util.List;

public class DriverIterator implements Iterator {
    private List<Driver> drivers;
    private int index;

    public DriverIterator(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean hasNext() {
        return index < drivers.size();
    }

    @Override
    public Object next() {
        return drivers.get(index++);
    }
}

