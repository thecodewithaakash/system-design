package t13_checkout;

// Version 1 from the frame 01 hook. Every payment method is a branch in one method.
class OldCheckout {

    void pay(String method, double amount) {
        if (method.equals("UPI")) {
            System.out.println("Paid Rs " + amount + " using UPI");
        } else if (method.equals("CARD")) {
            System.out.println("Paid Rs " + amount + " using card");
        } else if (method.equals("CASH")) {
            System.out.println("Collect Rs " + amount + " in cash at the door");
        }
    }
}
