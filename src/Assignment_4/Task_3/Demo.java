package Assignment_4.Task_3;

public class Demo {
    public static void main(String[] args) {
        Trip trip1 = new Trip(new DistanceBasedPricing(250));
        System.out.println("Cost by distance: " + trip1.calculateTripCost(10, 20));

        trip1.setPricingStrategy(new TimeBasedPricing(150));
        System.out.println("Cost by time: " + trip1.calculateTripCost(10, 20));

        trip1.setPricingStrategy(new FixedPricePricing(2500));
        System.out.println("Fixed price: " + trip1.calculateTripCost(10, 20));
    }
}
