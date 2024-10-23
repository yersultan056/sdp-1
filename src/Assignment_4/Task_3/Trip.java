package Assignment_4.Task_3;

public class Trip {
    private PricingStrategy pricingStrategy;

    public Trip(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTripCost(double distance, double time) {
        return pricingStrategy.calculateCost(distance, time);
    }
}

