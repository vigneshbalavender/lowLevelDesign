package LLD.DesignPatterns.structuralDP.Facade;

public class SoundSystem {

    public void on(){
        System.out.println("sound system is on");
    }
    public void off(){
        System.out.println("sound system is off");
    }
    public void setVolume(int level){
        System.out.println("Volume set to :"+level);
    }
}
