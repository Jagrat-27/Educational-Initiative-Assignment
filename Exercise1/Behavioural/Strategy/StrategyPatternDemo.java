package Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // Pay using UPI
        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(200);
    }
}
