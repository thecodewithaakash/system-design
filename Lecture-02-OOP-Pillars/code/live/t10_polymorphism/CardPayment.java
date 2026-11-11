package t10_polymorphism;

class CardPayment extends Payment implements Refundable {
    private final String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void pay() {
        System.out.println("Paid Rs " + amount + " using card ending " + lastFour());
    }

    @Override
    public void refund() {
        System.out.println("Refunded Rs " + amount + " to card ending " + lastFour());
    }

    private String lastFour() {
        return cardNumber.substring(cardNumber.length() - 4);
    }
}
