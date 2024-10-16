package Assignment_3.Task2;

public class TaxiClient {
    Command create_order;
    Command cancel_order;
    Command change_destination;

    public TaxiClient(Command create_order, Command cancel_order, Command change_destination) {
        this.create_order = create_order;
        this.cancel_order = cancel_order;
        this.change_destination = change_destination;
    }

    public void createAnOrder(){
        create_order.execute();
    }

    public void cancelAnOrder(){
        cancel_order.execute();
    }

    public void changeTheDestination(){
        change_destination.execute();
    }
}
