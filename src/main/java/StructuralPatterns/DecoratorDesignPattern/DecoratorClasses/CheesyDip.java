package StructuralPatterns.DecoratorDesignPattern.DecoratorClasses;

import StructuralPatterns.DecoratorDesignPattern.BaseClasses.BasePizza;

public class CheesyDip extends ToppingsDecorator {

    BasePizza basePizza;

    public CheesyDip(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return (this.basePizza.cost() + 80);
    }
}
