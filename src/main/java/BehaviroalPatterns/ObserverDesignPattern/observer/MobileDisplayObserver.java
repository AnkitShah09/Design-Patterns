package BehaviroalPatterns.ObserverDesignPattern.observer;

import BehaviroalPatterns.ObserverDesignPattern.observable.WeatherObservable;

public class MobileDisplayObserver implements Observer {

    WeatherObservable weatherObservable;

    public MobileDisplayObserver(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
    }

    @Override
    public void update() {
        System.out.println("MobileDisplay Observer called!!!");
        System.out.println("Weather changed to: " + weatherObservable.getTemperature());
        System.out.println("----------------------------------------------------");
    }
}
