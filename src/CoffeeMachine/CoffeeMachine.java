package CoffeeMachine;

public class CoffeeMachine {
    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        return coffeeFactory.createCoffee(type);
    }
}
