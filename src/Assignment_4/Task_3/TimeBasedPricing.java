package Assignment_4.Task_3;

public class TimeBasedPricing implements PricingStrategy {
    private double costPerMinute;

    public TimeBasedPricing(double costPerMinute) {
        this.costPerMinute = costPerMinute;
    }

    @Override
    public double calculateCost(double distance, double time) {
        return time * costPerMinute;
    }
}