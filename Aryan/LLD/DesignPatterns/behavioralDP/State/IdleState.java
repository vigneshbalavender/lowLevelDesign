package LLD.DesignPatterns.behavioralDP.State;

public class IdleState implements CoffeeMachineState{
    private CoffeeMachine coffeeMachine;
    public IdleState(CoffeeMachine machine){
        coffeeMachine=machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("coin inserted. Please Select Coffee");
        coffeeMachine.setState(coffeeMachine.getSelectCoffeeState());
    }

    @Override
    public void selectCoffee() {
        System.out.println("Please Insert Coin first...");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Please Insert Coin First....");
    }
}
