package LLD.solid.Liskov.goodcode;

public class Car implements EngineVehicle{


    @Override
    public void Move() {
       startEngine();
        System.out.println("car start Moving..");
    }

    @Override
    public void startEngine() {
        System.out.println("car Engine start");
    }
}
