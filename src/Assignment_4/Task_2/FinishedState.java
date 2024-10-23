package Assignment_4.Task_2;

public class FinishedState implements TaxiOrderState {
    @Override
    public void status() {
        System.out.println("Order is finished.");
    }
}
