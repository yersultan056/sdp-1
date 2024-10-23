package Assignment_4.Task_1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("\n=============================\n");

        Order order = new Order();
        Client client = new Client("Alice");
        client.subscribeToOrder(order);
        order.setStatus("Order is being prepared");
        order.setStatus("The order is ready");

        System.out.println("\n=============================\n");

        order.setStatus("Taxi is approaching");
        order.setStatus("The taxi departs to its destination");

        System.out.println("\n=============================\n");

        order.setStatus("Order has been delivered");
        client.unsubscribeFromOrder(order);
    }
}
