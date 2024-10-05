package Assignment_2;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        Car car = new Car("Toyota Prius");
        CarSharing carSharing = new CarSharing(car);
        TaxiService taxiService = new CarSharingAdapter(carSharing);
        taxiService.requestTaxi(passenger);
    }
}
