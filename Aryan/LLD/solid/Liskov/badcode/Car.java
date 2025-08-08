package LLD.solid.Liskov.badcode;

public class Car implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("car engine start....");
    }
}
