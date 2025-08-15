package LLD.DesignPatterns.creationalDP.AbstractFactory;



public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("TATA");
        vehicle.drive();
        Vehicle vehicle1 = VehicleFactory.getVehicle("TOYOTA");
        vehicle1.drive();
    }
}
