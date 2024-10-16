package Assignment_3.Task1;

public class Repeater extends Handler {
    private Order currentOrder;

    @Override
    public void handle(Order order) {
        if (this.currentOrder == order) {
            System.out.println("All cars are busy, continuing the search...");
        } else {
            this.currentOrder = order;
        }
        super.handle(order);
    }
}
