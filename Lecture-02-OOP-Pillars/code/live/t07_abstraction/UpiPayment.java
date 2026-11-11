package t07_abstraction;

class UpiPayment extends Payment implements Refundable {           // new: implements
    private final String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void pay() {
        System.out.println("Paid Rs " + amount + " using UPI " + upiId);
    }

    @Override                                                       // new
    public void refund() {                                                 // new: public
        System.out.println("Refunded Rs " + amount + " to " + upiId);
    }
}
