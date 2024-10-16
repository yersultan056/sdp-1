package Assignment_3.Task1;

public class Taxi extends Handler {
    private final String number;

    public Taxi(String number) {
        this.number = number;
    }

    @Override
    public void handle(Order order) {
        if (checkIsBusy()) {
            System.out.println("Taxi " + number + " is busy.");
            super.handle(order);
        } else {
            System.out.println("Taxi " + number + " assigned to order " + order.getId());
        }
    }

    private boolean checkIsBusy() {
        return Math.random() < 0.85;
    }
}
