package LLD.DesignPatterns.creationalDP.Factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if("Car".equals(type)){
            return new Car();
        }else if( "Truck".equals(type)){
            return new Truck();
        }else if("Bike".equals(type)){
            return new Bike();
        }else{
            throw new IllegalArgumentException("unknown vehicle type");
        }
    }
}
