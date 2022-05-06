package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ITConsultingService implements Subject {
    private List<Observer> observers;

    public ITConsultingService() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(Observer o, int answer) {
        o.update(answer);
        if(o.isSolved()){
            removeObserver(o);
        }
    }

    public void somethingChanged(Observer o, int answer) {
        notifyObservers(o, answer);
    }

    public void setAnswer(Observer o, int answer) {
        somethingChanged(o, answer);
    }

    public int getSizeOfObserverList() {
        return observers.size();
    }

    public Observer getObserver(int n){
        return observers.get(n);
    }

}
