package CoffeeMachine;

public abstract class Coffee {
    private final double cost;

    public double getCost() {
        return cost;
    }

    public Coffee(double cost) {
        this.cost = cost;
    }

    public void makeCoffee() {}
}
