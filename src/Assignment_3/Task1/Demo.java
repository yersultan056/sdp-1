package Assignment_3.Task1;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new Repeater();

        // Build the chain of handlers: Balance -> Location -> Taxi -> Repeater
        handler.bind(new BalanceChecker(100, 50)) // Client has 100 units, 50 required
                .bind(new LocationChecker(true)) // Location is valid
                .bind(new Taxi("777SSS01"))
                .bind(new Taxi("001RSH01"))
                .bind(new Taxi("909RWA01"))
                .bind(new Taxi("546SHM03"))
                .bind(new Taxi("881SDP01"))
                .bind(handler); // Repeater at the end

        Order order = new Order("#1");
        handler.handle(order);
    }
}