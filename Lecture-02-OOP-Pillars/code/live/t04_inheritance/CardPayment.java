package t04_inheritance;

class CardPayment extends Payment {
    private final String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;

        // this below code will throw an error because super() must be the first statement in the constructor. So, we need to move this line to the first line of the constructor. This is because the parent class constructor needs to be called before the child class constructor can execute. If we try to call super() after initializing the cardNumber field, it will result in a compilation error. Therefore, we need to call super(amount) as the first statement in the constructor to ensure that the parent class constructor is executed before any other statements in the child class constructor.

        // super(amount); 
    }

    @Override                                                                   // new
    void pay() {                                                                // new
        String lastFour = cardNumber.substring(cardNumber.length() - 4);        // new
        System.out.println("Paid Rs " + amount + " using card ending " + lastFour); // new
    }                                                                           // new
}
