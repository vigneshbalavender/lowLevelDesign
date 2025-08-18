package LLD.DesignPatterns.behavioralDP.Template;

public class TeaBeverage extends Beverage{
    @Override
    void brew() {
        System.out.println("brewing tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar , milk and cordamom");
    }
}
