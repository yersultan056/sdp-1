package Assignment_3.Task2;

public class ChangeDestinationCommand implements Command {
    TaxiManager taxi_manager;

    public ChangeDestinationCommand(TaxiManager taxi_manager) {
        this.taxi_manager = taxi_manager;
    }

    @Override
    public void execute() {
        taxi_manager.changeDestination();
    }
}
