package LLD.DesignPatterns.behavioralDP.strategy;

public class UPIPayment implements PaymentStrategy{
    public void processPayment(){
        System.out.println("UPI payment triggered...");
    }
}
