package LLD.Liskov.goodcode;

public class Cycle implements Vehicle {
    @Override
    public void Move() {
        System.out.println("Cycle start Moving...");
    }
}
