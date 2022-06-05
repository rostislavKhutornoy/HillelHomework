package CoffeeMachine.CoffeeTypes;

import CoffeeMachine.Coffee;

public class Americano extends Coffee {
    public Americano(double cost) {
        super(cost);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        System.out.println("Make americano");
    }

    @Override
    public String toString() {
        return "Americano - " + super.getCost() + "$";
    }
}
