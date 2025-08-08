package LLD.solid.Liskov.badcode;

public class Cycle implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("cycle doesnt have engine");
        throw new UnsupportedOperationException();
    }
}
