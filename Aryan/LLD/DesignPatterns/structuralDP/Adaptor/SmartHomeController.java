package LLD.DesignPatterns.structuralDP.Adaptor;

public class SmartHomeController {
    public static void main(String[] args) {
      SmartDevice ac = new AirConditionarAdaptor(new AirConditionar());
      SmartDevice tubeLight = new TubeLightAdaptor(new TubeLight());
      SmartDevice coffeeMachine = new CoffeeMachineAdaptor(new CoffeeMachine());


      ac.turnOn();
      ac.turnOff();

      tubeLight.turnOn();
      tubeLight.turnOff();

      coffeeMachine.turnOn();
      coffeeMachine.turnOff();

    }
}
