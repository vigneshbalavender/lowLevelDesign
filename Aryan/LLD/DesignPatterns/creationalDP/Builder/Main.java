package LLD.DesignPatterns.creationalDP.Builder;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.Builder()
                .setEngine("petrolEngine")
                .setWheels(4)
                .setSeats(7)
                .setColor("red")
                .setSunroof(true)
                .setNavigationSystem(true)
                .build();

        System.out.println(car);
    }
}
