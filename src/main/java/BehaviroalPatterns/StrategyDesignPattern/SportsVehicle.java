package BehaviroalPatterns.StrategyDesignPattern;

import BehaviroalPatterns.StrategyDesignPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }

}
