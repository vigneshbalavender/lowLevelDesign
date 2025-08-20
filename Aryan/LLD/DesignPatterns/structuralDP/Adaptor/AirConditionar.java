package LLD.DesignPatterns.structuralDP.Adaptor;

public class AirConditionar {

    public void connectWithBluetooth(){
        System.out.println("AC connecting via Bluetooth...");
    }
    public void disconnectWithBluetooth(){
        System.out.println("AC disconnecting from Bluetooth...");
    }

    public void coolingON(){
        System.out.println("AC cooling Mode ON");
    }
    public void coolingOff(){
        System.out.println("AC cooling Mode off");
    }

}
