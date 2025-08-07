package LLD.Liskov.goodcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //you can handle vehicle and engine vehicle seperately or else
        //you can handle commonly by parent interface by only accessing common parent methods

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bike());
        vehicleList.add(new Cycle());

        for(Vehicle vehicle:vehicleList){
            vehicle.Move();
//            vehicle.startEngine()   //compile-Time error

        }
    }
}
