package singleton.LazyDoubleChecked;

public class LazyDoubleCheckedDemo {

    public static void main(String[] args) {

        LazyDoubleDriverManager driverManager1 = LazyDoubleDriverManager.getInstance();
        LazyDoubleDriverManager driverManager2 = LazyDoubleDriverManager.getInstance();


        if (driverManager1 == driverManager2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Different instances (this should not happen).");
        }

        String driver = driverManager1.findNearestDriver("Location A");
        System.out.println("Driver found: " + driver);

    }

}
