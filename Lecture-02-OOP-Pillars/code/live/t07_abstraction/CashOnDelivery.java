package t07_abstraction;

class CashOnDelivery extends Payment {

    CashOnDelivery(double amount) {
        super(amount);
    }

    @Override                                                           // new
    void pay() {                                                        // new
        System.out.println("Collect Rs " + amount + " in cash at the door"); // new
    }                                                                   // new
}
