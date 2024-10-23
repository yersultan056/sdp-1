package Assignment_4.Task_3;

public class DistanceBasedPricing implements PricingStrategy {
    private double costPerKm;

    public DistanceBasedPricing(double costPerKm) {
        this.costPerKm = costPerKm;
    }

    @Override
    public double calculateCost(double distance, double time) {
        return distance * costPerKm;
    }
}
