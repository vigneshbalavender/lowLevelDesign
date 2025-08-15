package LLD.DesignPatterns.creationalDP.AbstractFactory;

public class TataCar extends Car{
    String model;
    public TataCar(String model){
        this.model = model;
    }
    public void drive(){
        System.out.println("start driving Tata "+model+" car..");
    }
}
