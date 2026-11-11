package t13_checkout;

// Frame 13: the payoff. The payment classes are ready from the earlier frames.
// Live: write Checkout.java, switch main to use it, then add PayLaterPayment.java.
public class Main {
    public static void main(String[] args) {
        OldCheckout oldCheckout = new OldCheckout();
        oldCheckout.pay("UPI", 410);
        oldCheckout.pay("CARD", 250);
        oldCheckout.pay("CASH", 180);
        oldCheckout.pay("UPl", 99);   // typo (lowercase L): compiles, prints nothing
    }
}
