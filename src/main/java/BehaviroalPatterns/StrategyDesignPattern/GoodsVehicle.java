package BehaviroalPatterns.StrategyDesignPattern;

import BehaviroalPatterns.StrategyDesignPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }

}
