package Assignment_4.Task_3;

public class FixedPricePricing implements PricingStrategy {
    private double fixedPrice;

    public FixedPricePricing(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculateCost(double distance, double time) {
        return fixedPrice;
    }
}

