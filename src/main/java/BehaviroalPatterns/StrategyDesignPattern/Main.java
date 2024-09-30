package BehaviroalPatterns.StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();
    }
}
