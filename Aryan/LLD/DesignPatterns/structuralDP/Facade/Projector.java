package LLD.DesignPatterns.structuralDP.Facade;

public class Projector {
    public void on(){
        System.out.println("projector is on");
    }
    public void off(){
        System.out.println("projector is off");
    }
    public void setInput(String input){
        System.out.println("projector input is set to :"+input);
    }
}
