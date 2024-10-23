package Assignment_4.Task_4;

public class PremiumTaxiOrder extends OrderProcess {

    @Override
    protected void checkAvailability() {
        System.out.println("Checking premium taxi availability.");
    }

    @Override
    protected void calculateCost() {
        System.out.println("Calculating cost for premium taxi.");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Confirming premium taxi order.");
    }

    @Override
    protected void endProcess() {
        System.out.println("Premium order process completed with extra services.");
    }
}
