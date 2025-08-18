package LLD.DesignPatterns.behavioralDP.Template;

public class CoffeeBeverage extends Beverage{
    @Override
    void brew() {
        System.out.println("Brewing coffee...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
