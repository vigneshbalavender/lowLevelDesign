package LLD.DesignPatterns.structuralDP.Adaptor;

public class CoffeeMachineAdaptor implements SmartDevice{
     CoffeeMachine coffeeMachine;
     public CoffeeMachineAdaptor(CoffeeMachine coffeeMachine){
         this.coffeeMachine=coffeeMachine;
     }

    @Override
    public void turnOn() {
        coffeeMachine.initializeZigbeeConnection();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff() {
        coffeeMachine.stopBrewing();
        coffeeMachine.terminateZigbeeConnection();
    }
}
