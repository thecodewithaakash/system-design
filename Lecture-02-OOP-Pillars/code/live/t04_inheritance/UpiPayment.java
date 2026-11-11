package t04_inheritance;

class UpiPayment extends Payment {
    private final String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        // super.pay();
        this.upiId = upiId;
    }

    @Override                                                     // new
    void pay() {                                                        // new
        System.out.println("Paid Rs " + amount + " using UPI " + upiId); // new
    }  

    // - error: getReceipt() in UpiPayment cannot override getReceipt() in Payment due to "final" keyword
    // @override
    // String getReceipt(){
    //      return "Receipt: Rs " + amount + " paid";
    // }
}