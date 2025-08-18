package LLD.DesignPatterns.behavioralDP.State;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine=new CoffeeMachine();

        coffeeMachine.selectCoffee();
        coffeeMachine.insertCoin();
        coffeeMachine.dispenseCoffee();
        coffeeMachine.selectCoffee();
        coffeeMachine.dispenseCoffee();
    }
}
