package LLD.DesignPatterns.structuralDP.Decorator;

public class Cappucino implements Coffee{
    @Override
    public double getCost() {
        return 3.5;
    }

    @Override
    public String getDescription() {
        return "Cappucino";
    }
}
