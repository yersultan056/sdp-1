package Assignment_4.Task_3;

public class Demo {
    public static void main(String[] args) {
        PricingStrategy distanceBased = new DistanceBasedPricing(2.5);
        Trip trip1 = new Trip(distanceBased);
        System.out.println("Cost by distance: " + trip1.calculateTripCost(10, 20));

        PricingStrategy timeBased = new TimeBasedPricing(1.5);
        trip1.setPricingStrategy(timeBased);
        System.out.println("Cost by time: " + trip1.calculateTripCost(10, 20));

        PricingStrategy fixedPrice = new FixedPricePricing(50);
        trip1.setPricingStrategy(fixedPrice);
        System.out.println("Fixed price: " + trip1.calculateTripCost(10, 20));
    }
}
