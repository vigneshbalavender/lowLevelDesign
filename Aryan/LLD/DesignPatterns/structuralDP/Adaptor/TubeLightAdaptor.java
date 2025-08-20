package LLD.DesignPatterns.structuralDP.Adaptor;

public class TubeLightAdaptor implements SmartDevice{
     TubeLight tubeLight;

     public TubeLightAdaptor(TubeLight tubeLight){
         this.tubeLight = tubeLight;
     }
    @Override
    public void turnOn() {
        tubeLight.connectWithWifi();
        tubeLight.lightOn();
    }

    @Override
    public void turnOff() {
       tubeLight.lightOff();
       tubeLight.disconnectWithWifi();
    }
}
