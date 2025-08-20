package LLD.DesignPatterns.structuralDP.Decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public double getCost(){
        return coffee.getCost()+2.1;
    }
    public String getDescription(){
        return coffee.getDescription()+", sugar";
    }
}
