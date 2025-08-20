package LLD.DesignPatterns.structuralDP.Decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee cappucino = new Cappucino();
        print(cappucino);
        Coffee milkCappucino = new MilkDecorator(cappucino);
        print(milkCappucino);
        Coffee sugarMilkCappucino =new SugarDecorator(milkCappucino);
        print(sugarMilkCappucino);

        Coffee espresso = new Espresso();
        espresso = new SugarDecorator(espresso);
        espresso = new VennilaDecorator(espresso);
        print(espresso);

    }
    public static void print(Coffee coffee){
        System.out.println(coffee.getDescription()+". $"+ coffee.getCost());
    }
}
