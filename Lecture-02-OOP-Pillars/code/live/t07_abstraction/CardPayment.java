package t07_abstraction;

class CardPayment extends Payment implements Refundable {           // new: implements
    private final String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Paid Rs " + amount + " using card ending " + lastFour());
    }

    @Override                                                       // new
    public void refund() {                                          // new
        System.out.println("Refunded Rs " + amount + " to card ending " + lastFour());
    }

    private String lastFour() {                                     // new: shared helper
        return cardNumber.substring(cardNumber.length() - 4);
    }
}
