package Assignment_4.Task_1;

public class Order implements Subject {
    private Observer observer;
    private String status;

    public Order() {
        this.status = "Order created";
    }

    @Override
    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void removeObserver() {
        this.observer = null;
    }

    @Override
    public void notifyObserver() {
        if (observer != null) {
            observer.update(status);
            if (status == "Taxi is approaching"){
                System.out.println("The taxi is coming!!!");
            }
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

    public String getStatus() {
        return status;
    }
}
