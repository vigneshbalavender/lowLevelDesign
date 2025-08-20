package LLD.DesignPatterns.structuralDP.Composite;

public class SmartLight implements SmartComponent{
     private String name="smartLight";
     public SmartLight(){}
     public SmartLight(String name){
         this.name = name;
     }
    @Override
    public void turnOff() {
        System.out.println(name+" turned off");
    }

    @Override
    public void turnOn() {
        System.out.println(name+" turned ON");
    }
}
