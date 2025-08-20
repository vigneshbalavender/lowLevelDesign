package LLD.DesignPatterns.structuralDP.Decorator;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
      return coffee.getDescription();
    }
}
