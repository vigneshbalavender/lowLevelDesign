package LLD.DesignPatterns.behavioralDP.State;

public class SelectCoffeeState implements CoffeeMachineState{
    private CoffeeMachine coffeeMachine;
    public SelectCoffeeState(CoffeeMachine machine){
        coffeeMachine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted. Please select the Coffee..");
    }

    @Override
    public void selectCoffee() {
        System.out.println("coffee selected. Coffee is being made...");
        coffeeMachine.setState(coffeeMachine.getDispenseCoffeeState());
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Coffee is not selected. Please select Coffee first..");
    }
}
