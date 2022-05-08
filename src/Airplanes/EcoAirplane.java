package Airplanes;

public class EcoAirplane extends Airplane {

    public EcoAirplane(String type, String model, int ecoPlaces) {
        super(type, model, ecoPlaces);
    }

    @Override
    public void printAirplaneInfo() {
        System.out.println("Aircraft type: " + type +
                ", model: " + model +
                ", num. of eco. class passengers: " + ecoPlaces);
    }

}
