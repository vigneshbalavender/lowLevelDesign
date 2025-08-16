package LLD.DesignPatterns.behavioralDP.strategy;

public class StripePayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("stripe payment open brower for payment processing...");
    }
}
