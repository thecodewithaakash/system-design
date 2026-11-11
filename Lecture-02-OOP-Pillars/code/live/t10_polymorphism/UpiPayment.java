package t10_polymorphism;

class UpiPayment extends Payment implements Refundable {
    private final String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Paid Rs " + amount + " using UPI " + upiId);
    }

    @Override
    public void refund() {
        System.out.println("Refunded Rs " + amount + " to " + upiId);
    }

    String getUpiId() {
        return upiId;
    }
}
