package Task7;

public class AirFighter extends Airplane{

    public AirFighter(String type, String model) {
        super(type, model);
    }

    @Override
    public void printAirplaneInfo() {
        System.out.println("Aircraft type: " + type +
                ", model: " + model);
    }

}
