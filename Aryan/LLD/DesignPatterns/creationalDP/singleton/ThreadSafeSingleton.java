package LLD.DesignPatterns.creationalDP.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}

    //lazy initialize success
    //thread safe success/
    // but syncronized on everycall -> preformance slowdown in high Traffic system
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance=new ThreadSafeSingleton();
        }
        return instance;
    }
}
