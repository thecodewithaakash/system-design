package t13_checkout;

abstract class Payment {
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();

    final String getReceipt() {
        return "Receipt: Rs " + amount + " paid";
    }
}
