package Assignment_1.Builder;

public class ClientDriver {

    public static void main(String[] args) {
        Driver2 driver = new Driver2.DriverBuilder()
                .withName("Johny Silverhand")
                .withCarModel("Porshe 911")
                .withLicenseNumber("XYZ12345")
                .withExperienceYears(5)
                .isAvailable(true)
                .build();

        System.out.println(driver);
    }


}

