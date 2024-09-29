package BehaviroalPatterns.ObserverDesignPattern.observable;

import BehaviroalPatterns.ObserverDesignPattern.observer.Observer;

public interface WeatherObservable {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

    Integer getTemperature();

    void setTemperature(Integer temperature);
}
