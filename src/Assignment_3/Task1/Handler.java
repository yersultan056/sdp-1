package Assignment_3.Task1;

public abstract class Handler {
    private Handler next;

    public void handle(Order order) {
        if (next != null) {
            next.handle(order);
        }
    }

    public Handler bind(Handler next) {
        this.next = next;
        return next;
    }
}
