package LLD.DesignPatterns.structuralDP.Adaptor;

public class AirConditionarAdaptor implements SmartDevice{
    AirConditionar airConditionar;
    public AirConditionarAdaptor(AirConditionar airConditionar){
        this.airConditionar=airConditionar;
    }
    @Override
    public void turnOn() {
        airConditionar.connectWithBluetooth();
        airConditionar.coolingON();
    }

    @Override
    public void turnOff() {
        airConditionar.coolingOff();
        airConditionar.disconnectWithBluetooth();
    }
}
