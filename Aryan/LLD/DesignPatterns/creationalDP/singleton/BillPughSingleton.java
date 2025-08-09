package LLD.DesignPatterns.creationalDP.singleton;


public class BillPughSingleton {
    private static BillPughSingleton instance;
    private BillPughSingleton(){}

    //thread-safe
    //lazy-loaded
    //very clean code
    //none major cons, best one
    private static class Holder{
        private static final BillPughSingleton instace=new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return Holder.instace;
    }
}
