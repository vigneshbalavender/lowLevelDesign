package LLD.DesignPatterns.creationalDP.AbstractFactory;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if("TATA".equals(type)) {
            return TataCarFactory.getVehicle();
        }if("TOYOTA".equals(type)){
            return ToyotaCarFactory.getVehicle();
        }
        else{
            throw new IllegalArgumentException("unknown vehicle type");
        }
    }
}
