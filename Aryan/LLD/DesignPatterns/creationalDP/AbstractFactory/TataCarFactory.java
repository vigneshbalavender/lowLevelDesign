package LLD.DesignPatterns.creationalDP.AbstractFactory;

public class TataCarFactory {
    public static Vehicle getVehicle(){
        return new TataCar("punch.EV");
    }
}
