package LLD.DesignPatterns.structuralDP.Composite;

import LLD.DesignPatterns.structuralDP.Adaptor.AirConditionar;

public class AirConditionor implements SmartComponent{
    private String name="AirConditionor";
    public AirConditionor(){}
    public AirConditionor(String name){
        this.name = name;
    }
    @Override
    public void turnOff() {
        System.out.println(name+" turned OFF");
    }

    @Override
    public void turnOn() {
        System.out.println(name+" turned ON");
    }
}
