package LLD.DesignPatterns.structuralDP.Decorator;

public class Espresso implements Coffee{
    @Override
    public double getCost() {
        return 4.5;
    }

    @Override
    public String getDescription() {
        return "Espresso ";
    }
}
