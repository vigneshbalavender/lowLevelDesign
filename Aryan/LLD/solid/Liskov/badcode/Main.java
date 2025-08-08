package LLD.solid.Liskov.badcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car());
        vehicleList.add(new Bike());
        vehicleList.add(new Cycle());

        for(Vehicle vehicle:vehicleList){
            vehicle.startEngine(); // bycycle object will throw error here
        }
        //in real bycycle doesnt have engine

        //so parent interface should be more generic
    }
}
