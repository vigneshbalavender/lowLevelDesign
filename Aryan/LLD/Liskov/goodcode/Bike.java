package LLD.Liskov.goodcode;

public class Bike implements EngineVehicle{
    @Override
    public void startEngine() {
        System.out.println("Bike Engine start..");
    }

    @Override
    public void Move() {
        startEngine();
        System.out.println("bike start moving..");
    }
}
