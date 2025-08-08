package LLD.solid.Liskov.badcode;

public class Bike implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("bike engine start...");
    }
}
