package LLD.DesignPatterns.creationalDP.Factory;

public class Truck implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Truck started..");
    }
    public void stop(){
        System.out.println("Truck stopped..");
    }
}
