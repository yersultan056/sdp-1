package Assignment_4.Task_3;

public class Demo {
    public static void main(String[] args) {
        PricingStrategy distanceBased = new DistanceBasedPricing(250);
        Trip trip1 = new Trip(distanceBased);
        System.out.println("Cost by distance: " + trip1.calculateTripCost(10, 20));

        PricingStrategy timeBased = new TimeBasedPricing(150);
        trip1.setPricingStrategy(timeBased);
        System.out.println("Cost by time: " + trip1.calculateTripCost(10, 20));

        PricingStrategy fixedPrice = new FixedPricePricing(2500);
        trip1.setPricingStrategy(fixedPrice);
        System.out.println("Fixed price: " + trip1.calculateTripCost(10, 20));
    }
}
