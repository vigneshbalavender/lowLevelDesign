package LLD.DesignPatterns.creationalDP.Factory;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        vehicle.drive();
        vehicle.stop();
        Vehicle vehicle1 = VehicleFactory.getVehicle("Truck");
        vehicle1.drive();
        vehicle1.stop();
        Vehicle vehicle2 =VehicleFactory.getVehicle("Bike");
        vehicle2.drive();
        vehicle2.stop();
    }
}
