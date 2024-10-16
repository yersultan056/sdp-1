package Assignment_3.Task4;

public interface Mediator {
    void registerClient(Client client);
    void registerDriver(Driver driver);
    void registerDispatcher(Dispatcher dispatcher);
    void requestRide(Client client);
    void confirmRide(Driver driver);
}
