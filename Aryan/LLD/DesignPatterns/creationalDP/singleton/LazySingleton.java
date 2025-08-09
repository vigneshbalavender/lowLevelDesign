package LLD.DesignPatterns.creationalDP.singleton;

public class LazySingleton {
    private static LazySingleton instance ;
    private LazySingleton(){

    }

    //object created only needed
    //not thread safe multiple thread can create multiple objects

    public LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
