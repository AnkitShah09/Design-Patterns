package BehaviroalPatterns.ObserverDesignPattern.observer;

import BehaviroalPatterns.ObserverDesignPattern.observable.WeatherObservable;

public class TVDisplayObserver implements Observer {

    WeatherObservable weatherObservable;

    public TVDisplayObserver(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void update() {
        System.out.println("TVDisplay Observer called!!!");
        System.out.println("Weather changed to: " + weatherObservable.getTemperature());
        System.out.println("----------------------------------------------------");
    }
}
