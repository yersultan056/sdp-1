package Assignment_4.Task_2;

public class TaxiOrder {
    TaxiOrderState status;

    public void setStatus(TaxiOrderState status) {
        this.status = status;
    }

    public TaxiOrder() {
        this.status = new CreatedState();
    }

    public void changeStatus() {
        if (status instanceof CreatedState) {
            setStatus(new ConfirmedState());
        } else if (status instanceof ConfirmedState) {
            setStatus(new OnTheWayState());
        } else if (status instanceof OnTheWayState) {
            setStatus(new FinishedState());
        }
    }

    public void showStatus() {
        status.status();
    }
}
