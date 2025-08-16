package LLD.DesignPatterns.behavioralDP.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("credit card payment started");
    }
}
