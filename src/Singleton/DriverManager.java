package Singleton;

public class DriverManager {

    private static DriverManager instance;

    public static DriverManager getInstance() {

        if(instance == null){
            instance = new DriverManager();
        }
        return instance;

    }

    private DriverManager(){}

    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: " + "Driver1");
        return "Driver1";

    }

}
