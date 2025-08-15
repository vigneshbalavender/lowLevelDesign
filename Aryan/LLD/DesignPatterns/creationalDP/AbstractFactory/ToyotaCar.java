package LLD.DesignPatterns.creationalDP.AbstractFactory;

public class ToyotaCar extends Car{
      String model;
    public ToyotaCar(String model){
        this.model =model;
    }
    public void drive(){
        System.out.println("start driving Toyota "+model+" car..");
    }
}
