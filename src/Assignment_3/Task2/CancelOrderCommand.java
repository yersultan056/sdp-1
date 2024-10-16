package Assignment_3.Task2;

public class CancelOrderCommand implements Command {
    TaxiManager taxi_manager;

    public CancelOrderCommand(TaxiManager taxi_manager) {
        this.taxi_manager = taxi_manager;
    }

    @Override
    public void execute() {
        taxi_manager.cancelOrder();
    }
}
