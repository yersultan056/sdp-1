package Assignment_4.Task_4;

public class Demo {
    public static void main(String[] args) {
        OrderProcess basicOrder = new BasicTaxiOrder();
        System.out.println("Processing basic taxi order:");
        basicOrder.processOrder();

        System.out.println("\nProcessing premium taxi order:");
        OrderProcess premiumOrder = new PremiumTaxiOrder();
        premiumOrder.processOrder();
    }
}
