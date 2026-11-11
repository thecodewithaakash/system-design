package t10_polymorphism;

abstract class Payment {
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void func(){
        System.out.println("Payment amount: Rs " + amount);
    }

    void pay(){
        System.out.println("Payment amount: Rs " + amount);
    }

    final String getReceipt() {
        return "Receipt: Rs " + amount + " paid";
    }
}
