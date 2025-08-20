package LLD.DesignPatterns.structuralDP.Adaptor;

public class TubeLight {

    public void connectWithWifi(){
        System.out.println("Light connecting to wifi....");
    }
    public void disconnectWithWifi(){
        System.out.println("Light disconnecting with wifi...");
    }
    public void lightOn(){
        System.out.println("tubeLight is turned On.");
    }
    public void lightOff(){
        System.out.println("tubeLight is turned Off.");
    }
}
