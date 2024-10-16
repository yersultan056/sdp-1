package Assignment_3.Task3;

public class Driver {
    private String name;
    private double x;
    private double y;

    public Driver(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistance(double clientX, double clientY) {
        return Math.sqrt(Math.pow(clientX - this.x, 2) + Math.pow(clientY - this.y, 2));
    }
}

