package BehaviroalPatterns.ObserverDesignPattern;

import BehaviroalPatterns.ObserverDesignPattern.observable.WeatherObservableImpl;
import BehaviroalPatterns.ObserverDesignPattern.observer.Observer;
import BehaviroalPatterns.ObserverDesignPattern.observer.TVDisplayObserver;
import BehaviroalPatterns.ObserverDesignPattern.observable.WeatherObservable;

public class Main {

    public static void main(String[] args) {
        WeatherObservable weatherObservable = new WeatherObservableImpl();

        Observer tvDisplayObserver1 = new TVDisplayObserver(weatherObservable);
        weatherObservable.add(tvDisplayObserver1);
        Observer tvDisplayObserver2 = new TVDisplayObserver(weatherObservable);
        weatherObservable.add(tvDisplayObserver2);

        weatherObservable.setTemperature(40);
        weatherObservable.remove(tvDisplayObserver2);
        weatherObservable.setTemperature(38);
    }
}
