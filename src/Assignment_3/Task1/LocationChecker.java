package Assignment_3.Task1;

public class LocationChecker extends Handler {
    private final boolean isLocationValid;

    public LocationChecker(boolean isLocationValid) {
        this.isLocationValid = isLocationValid;
    }

    @Override
    public void handle(Order order) {
        if (isLocationValid) {
            System.out.println("Location is valid for order " + order.getId());
            super.handle(order);
        } else {
            System.out.println("Cannot send a car to this location for order " + order.getId());
        }
    }
}
