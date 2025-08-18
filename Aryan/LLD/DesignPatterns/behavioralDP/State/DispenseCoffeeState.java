package LLD.DesignPatterns.behavioralDP.State;

public class DispenseCoffeeState implements CoffeeMachineState{
     private CoffeeMachine coffeeMachine;
    public DispenseCoffeeState(CoffeeMachine machine){
        coffeeMachine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("do not insert Coin while Coffee is being made..");
    }

    @Override
    public void selectCoffee() {
        System.out.println("Coffee is already selected and coffee is being made..");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("your Coffee is ready. please take it");
        coffeeMachine.setState(coffeeMachine.getIdleState());
    }
}
