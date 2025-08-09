package LLD.DesignPatterns.creationalDP.singleton;

public class EagerSingleton {
    //get initialized at application start itself
    private static EagerSingleton instance =new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
