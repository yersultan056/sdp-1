package Assignment_4.Task_4;

public abstract class OrderProcess {

    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
        endProcess();
    }

    protected abstract void checkAvailability();

    protected abstract void calculateCost();

    protected abstract void confirmOrder();

    protected void endProcess() {
        System.out.println("Order process completed.");
    }
}

