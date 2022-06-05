package CoffeeMachine.CoffeeTypes;

import CoffeeMachine.Coffee;

public class Tea extends Coffee {
    public Tea(double cost) {
        super(cost);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Make tea");
    }

    @Override
    public String toString() {
        return "Tea - " + super.getCost() + "$";
    }
}
