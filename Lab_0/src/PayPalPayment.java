package Lab_0.src;

public class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}