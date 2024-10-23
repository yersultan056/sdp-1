package Assignment_4.Task_4;

public class BasicTaxiOrder extends OrderProcess {

    @Override
    protected void checkAvailability() {
        System.out.println("Checking basic taxi availability.");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for basic taxi.");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Confirming basic taxi order.");
    }
}

