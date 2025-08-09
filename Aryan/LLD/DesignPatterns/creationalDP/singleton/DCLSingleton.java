package LLD.DesignPatterns.creationalDP.singleton;

public class DCLSingleton {
    private static DCLSingleton instance;
    private DCLSingleton(){};

    //thread-safe
    //lazy-loaded
    //syncronize only on fist call after that faster

    //but slightly more complex code
    public static DCLSingleton getInstance(){
        if(instance==null){
            synchronized (DCLSingleton.class){
                if(instance==null){
                    instance=new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
