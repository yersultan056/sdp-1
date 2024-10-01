package singleton.LazyDoubleChecked;

public class LazyDoubleDriverManager {

    private static LazyDoubleDriverManager instance;

    private LazyDoubleDriverManager() {}

    public static LazyDoubleDriverManager getInstance() {

        if (instance == null){
            synchronized (LazyDoubleDriverManager.class) {
                if (instance == null){
                    instance = new LazyDoubleDriverManager();

                }
            }
        }
        return instance;

    }

    public String findNearestDriver(String location) {
        System.out.println("Nearest driver found: " + "Driver1");
        return "Driver1";

    }

}
