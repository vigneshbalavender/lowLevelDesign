package LLD.DesignPatterns.structuralDP.Facade;

public class DVDPlayer {

    public void on(){
        System.out.println("DVD player is ON.");
    }
    public void play(String movie){
        System.out.println("Playing Movie :"+movie);
    }
    public void off(){
        System.out.println("DVD player is off.");
    }
}
