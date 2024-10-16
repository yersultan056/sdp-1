package Assignment_3.Task4;

import java.util.ArrayList;
import java.util.List;

public class DispatcherMediator implements Mediator {
    private List<Client> clients = new ArrayList<>();
    private List<Driver> drivers = new ArrayList<>();
    private Dispatcher dispatcher;

    @Override
    public void registerClient(Client client) {
        clients.add(client);
    }

    @Override
    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public void registerDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void requestRide(Client client) {
        System.out.println("Ride requested by " + client.getName());
        // Логика поиска свободного водителя и оповещения
        if (!drivers.isEmpty()) {
            Driver driver = drivers.get(0); // Простой пример выбора первого водителя
            dispatcher.assignDriver(driver, client);
        } else {
            System.out.println("No available drivers.");
        }
    }

    @Override
    public void confirmRide(Driver driver) {
        System.out.println("Ride confirmed with driver " + driver.getName());
    }
}