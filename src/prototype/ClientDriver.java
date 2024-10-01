package prototype;

public class ClientDriver {

    public static void main(String[] args) {
        Driver originalDriver = new Driver("John Doe", "Toyota Prius");
        System.out.println("Original Driver: " + originalDriver.getName());
        System.out.println("Original Driver’s car: " + originalDriver.getCarModel());

        Driver clonedDriver = (Driver) originalDriver.clone();
        clonedDriver.setName("Jane Doe");
        System.out.println("Cloned Driver: " + clonedDriver.getName());
        System.out.println("Cloned Driver’s car: " + clonedDriver.getCarModel());

    }

}
