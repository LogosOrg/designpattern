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

    public void somethingChanged(){
        notifyObservers();
    }

    public void AnswerToCustomers(){
        
        somethingChanged();
    }
}
