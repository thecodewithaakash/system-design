package t13_checkout;

class CashOnDelivery extends Payment {

    CashOnDelivery(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Collect Rs " + amount + " in cash at the door");
    }
}
