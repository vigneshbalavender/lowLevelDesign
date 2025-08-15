package LLD.DesignPatterns.creationalDP.Factory;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("bike started..");
    }
    public void stop(){
        System.out.println("Bike stopped..");
    }
}
