package t04_inheritance;

class Payment {
    protected final double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void pay() {                                        // new
        System.out.println("Paying Rs " + amount);      // new
    }                                                   // new

    // String getReceipt() {
    //     return "Receipt: Rs " + amount + " paid";
    // }

    // - below code : if i don't want to override the "getReceipt()" method in the child class, then i can make the "getReceipt()" method as final in the parent class. This way, the child class will not be able to override the "getReceipt()" method and will have to use the implementation provided by the parent class. This is useful when we want to provide a default implementation of a method that should not be changed by the child classes.

    final String getReceipt() {
        return "Receipt: Rs " + amount + " paid";
    }
}
