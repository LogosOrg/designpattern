package designpatterns.observer;

public interface mySubject {
    public void registerObserver(myObserver o);
    public void removeObserver(myObserver o);
    public void notifyObservers();
}
