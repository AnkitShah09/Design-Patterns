package StructuralPatterns.DecoratorDesignPattern;

import StructuralPatterns.DecoratorDesignPattern.BaseClasses.BasePizza;
import StructuralPatterns.DecoratorDesignPattern.BaseClasses.MargheritaPizza;
import StructuralPatterns.DecoratorDesignPattern.DecoratorClasses.CheesyDip;

public class Main {

    public static void main(String[] args) {

        BasePizza margheritaPizza = new MargheritaPizza();

        BasePizza margheritaPizzaWithCheesyDip = new CheesyDip(margheritaPizza);
        System.out.println(margheritaPizzaWithCheesyDip.cost());
    }
}
