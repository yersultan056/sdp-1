package Assignment_4.Task_1;

public interface Subject {
    void setObserver(Observer observer);
    void removeObserver();
    void notifyObserver();
}