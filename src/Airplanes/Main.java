package Airplanes;

public class Main {
    public static void main(String[] args) {
        AirFighter fighter = new AirFighter("Jet", "F-22 Raptor");
        EcoAirplane ecoplane = new EcoAirplane("Airliner", "Aerobus 737", 120);
        BusAirplane busplane = new BusAirplane("Airliner", "Boeing 777", 180, 28);

        fighter.printAirplaneInfo();
        ecoplane.printAirplaneInfo();
        busplane.printAirplaneInfo();
    }
}
