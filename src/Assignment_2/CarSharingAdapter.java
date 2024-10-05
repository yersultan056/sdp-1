package Assignment_2;

public class CarSharingAdapter extends CarSharing implements TaxiService {
    private CarSharing carSharing;

    public CarSharingAdapter(CarSharing carSharing) {
       this.carSharing = carSharing;
    }

    @Override
    public void requestTaxi(Passenger passenger) {
        Driver driver = new Driver();
        carSharing.rentFreeCar(driver);
        System.out.println("A request for a passenger has been received");
    }
}
