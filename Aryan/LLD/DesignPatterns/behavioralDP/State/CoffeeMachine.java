package LLD.DesignPatterns.behavioralDP.State;

public class CoffeeMachine {
    private CoffeeMachineState idleState;
    private CoffeeMachineState selectCoffeeState;
    private CoffeeMachineState dispenseCoffeeState;

    private CoffeeMachineState curState;
    public CoffeeMachine(){
        idleState = new IdleState(this);
        selectCoffeeState = new SelectCoffeeState(this);
        dispenseCoffeeState = new DispenseCoffeeState(this);
        curState = idleState;
    }
    public void setState(CoffeeMachineState state){
        curState = state;
    }
    public void insertCoin(){
        curState.insertCoin();
    }
    public void selectCoffee(){
        curState.selectCoffee();
    }
    public void dispenseCoffee(){
        curState.dispenseCoffee();
    }
    public CoffeeMachineState getDispenseCoffeeState() {
        return dispenseCoffeeState;
    }

    public CoffeeMachineState getSelectCoffeeState() {
        return selectCoffeeState;
    }

    public CoffeeMachineState getIdleState() {
        return idleState;
    }
}
