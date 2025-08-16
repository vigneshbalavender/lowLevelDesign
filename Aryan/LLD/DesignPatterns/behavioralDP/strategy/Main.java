package LLD.DesignPatterns.behavioralDP.strategy;

public class Main {
    public static void main(String[] args) {
      PaymentStrategy creditCard = new CreditCardPayment();
      PaymentStrategy paypal = new PaypalPayment();
      PaymentStrategy stripe = new StripePayment();
      PaymentStrategy upiPayment = new UPIPayment();

      PaymentProcessor processor = new PaymentProcessor(creditCard);
      processor.processPayment();

      processor.setPaymentStrategy(paypal);
      processor.processPayment();

      processor.setPaymentStrategy(stripe);
      processor.processPayment();

      processor.setPaymentStrategy(upiPayment);
      processor.processPayment();
    }
}
