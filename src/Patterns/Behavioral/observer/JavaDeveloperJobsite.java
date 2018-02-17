package Patterns.Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobsite implements Observed {
    List<String>vacancies = new ArrayList<>();
    List<Observer>subscribers = new ArrayList<>();

    public void addVaccancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVaccancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer:subscribers){
            observer.handleEvent(this.vacancies);
        }
    }
}
