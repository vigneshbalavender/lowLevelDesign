package LLD.DesignPatterns.behavioralDP.Template;

public class TemplateDemo {
    public static void main(String[] args) {
        Beverage coffee = new CoffeeBeverage();
        Beverage tea =new TeaBeverage();
        coffee.prepare();
        tea.prepare();
    }
}
