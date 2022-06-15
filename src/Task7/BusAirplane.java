package Task7;

public class BusAirplane extends Airplane{

    public BusAirplane(String type, String model, int ecoPlaces, int busPlaces) {
        super(type, model, ecoPlaces, busPlaces);
    }

    @Override
    public void printAirplaneInfo() {
        System.out.println("Aircraft type: " + type +
                ", model: " + model +
                ", num. of eco. class passengers: " + ecoPlaces +
                ", business class passengers: " + busPlaces);
    }

}
