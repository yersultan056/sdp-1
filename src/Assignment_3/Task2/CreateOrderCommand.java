package Assignment_3.Task2;

public class CreateOrderCommand implements Command {
    TaxiManager taxi_manager;

    public CreateOrderCommand(TaxiManager taxi_manager) {
        this.taxi_manager = taxi_manager;
    }

    @Override
    public void execute() {
        taxi_manager.createOrder();
    }
}
