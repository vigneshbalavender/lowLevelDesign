package LLD.DesignPatterns.creationalDP.AbstractFactory;

public class ToyotaCarFactory {
    public static Vehicle getVehicle(){
        return new ToyotaCar("Hyryder");
    }
}
