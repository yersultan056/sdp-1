package Assignment_3.Task1;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new Repeater();

        handler.bind(new BalanceChecker(100, 50))
                .bind(new LocationChecker(true))
                .bind(new Taxi("777SSS01"))
                .bind(new Taxi("001RSH01"))
                .bind(new Taxi("909RWA01"))
                .bind(new Taxi("546SHM03"))
                .bind(new Taxi("881SDP01"))
                .bind(handler);

        Order order = new Order("#1");
        handler.handle(order);
    }
}