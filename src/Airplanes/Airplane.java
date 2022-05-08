package Airplanes;

public abstract class Airplane {
    public String type;
    public String model;
    public int ecoPlaces;
    public int busPlaces;

    public Airplane(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public Airplane(String type, String model, int ecoPlaces) {
        this.type = type;
        this.model = model;
        this.ecoPlaces = ecoPlaces;
    }

    public Airplane(String type, String model, int ecoPlaces, int busPlaces) {
        this.type = type;
        this.model = model;
        this.ecoPlaces = ecoPlaces;
        this.busPlaces = busPlaces;
    }

    public void printAirplaneInfo() {
    }
}
