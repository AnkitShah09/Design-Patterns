package BehaviroalPatterns.ObserverDesignPattern.observable;

import BehaviroalPatterns.ObserverDesignPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservableImpl implements WeatherObservable {

    private Integer temperature;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
