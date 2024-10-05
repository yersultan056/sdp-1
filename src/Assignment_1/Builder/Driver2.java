package Assignment_1.Builder;

public class Driver2 {
    private String name;
    private String carModel;
    private String licenseNumber;
    private int experienceYears;
    private boolean isAvailable;

    private Driver2(DriverBuilder builder) {
        this.name = builder.name;
        this.carModel = builder.carModel;
        this.licenseNumber = builder.licenseNumber;
        this.experienceYears = builder.experienceYears;
        this.isAvailable = builder.isAvailable;
    }

    @Override
    public String toString() {
        return "Driver2{" +
                "name='" + name + '\'' +
                ", carModel='" + carModel + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", experienceYears=" + experienceYears +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public static class DriverBuilder {
        private String name;
        private String carModel;
        private String licenseNumber;
        private int experienceYears;
        private boolean isAvailable;

        public DriverBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DriverBuilder withCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public DriverBuilder withLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public DriverBuilder withExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public DriverBuilder isAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public Driver2 build() {
            return new Driver2(this);
        }

    }

}

