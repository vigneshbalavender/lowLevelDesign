package LLD.DesignPatterns.behavioralDP.strategy;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("payment processing on paypal...");
    }
}
