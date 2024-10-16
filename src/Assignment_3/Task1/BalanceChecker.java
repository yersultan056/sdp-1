package Assignment_3.Task1;

public class BalanceChecker extends Handler {
    private final double clientBalance;
    private final double requiredBalance;

    public BalanceChecker(double clientBalance, double requiredBalance) {
        this.clientBalance = clientBalance;
        this.requiredBalance = requiredBalance;
    }

    @Override
    public void handle(Order order) {
        if (clientBalance >= requiredBalance) {
            System.out.println("Client balance verified for order " + order.getId());
            super.handle(order);
        } else {
            System.out.println("Insufficient balance for order " + order.getId());
        }
    }
}