package LLD.DesignPatterns.structuralDP.Decorator;

public class VennilaDecorator extends CoffeeDecorator{
    public VennilaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost()+2.7;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+", vennila";
    }
}
