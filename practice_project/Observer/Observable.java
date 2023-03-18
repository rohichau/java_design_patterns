package Observer;

public interface Observable {
    // List<Observer> observers;

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    
}
