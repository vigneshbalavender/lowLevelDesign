package LLD.DesignPatterns.behavioralDP.Template;

public abstract class Beverage {

    public final void prepare(){
       boilWater();
       brew();
       pourInCup();
       addCondiments();
    }

    void boilWater(){
        System.out.println("Boiling water...");
    }
    void pourInCup(){
        System.out.println("pour into Cup..");
    }

    abstract void brew();
    abstract void addCondiments();

}
