package t07_abstraction;

 abstract class Payment {                            // new: abstract
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void pay();                  // new: no body

    final String getReceipt() {
        return "Receipt: Rs " + amount + " paid";
    }
}