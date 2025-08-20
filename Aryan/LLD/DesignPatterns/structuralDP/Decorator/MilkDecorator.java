package LLD.DesignPatterns.structuralDP.Decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost()+ 2.5;
    }
    public String getDescription(){
        return coffee.getDescription()+", milk";
    }

}
