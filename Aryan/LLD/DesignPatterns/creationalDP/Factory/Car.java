package LLD.DesignPatterns.creationalDP.Factory;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("car started...");
    }
    public void stop(){
        System.out.println("Car stopped..");
    }
}
