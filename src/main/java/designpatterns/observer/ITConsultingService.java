package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ITConsultingService implements Subject {
    private List<Observer> observers;
    
    public ITConsultingService() {
        observers = new ArrayList<Observer>();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
