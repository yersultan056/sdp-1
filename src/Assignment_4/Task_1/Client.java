package Assignment_4.Task_1;

public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Client " + name + " received update: Order status is now '" + status + "'");
    }

    public void subscribeToOrder(Order order) {
        order.setObserver(this);
    }

    public void unsubscribeFromOrder(Order order) {
        order.removeObserver();
    }
}
