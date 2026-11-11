package t07_abstraction;

public class Main {
    public static void main(String[] args) {
        UpiPayment upi = new UpiPayment(410, "rahul@okaxis");
        CardPayment card = new CardPayment(250, "4111111111114242");
        CashOnDelivery cash = new CashOnDelivery(180);

        // we got "error: Payment is abstract; cannot be instantiated" because Payment is an abstract class and we cannot create an object of an abstract class. We can only create objects of concrete classes that extend the abstract class. 
        
        // Payment p = new Payment();


        // upi.pay();
        // card.pay();
        // cash.pay();

        // upi.refund();                                               // new
        // card.refund();                                              // new
        // cash.refund();                                              // new
    }
}


// # cmd: javac -d out .\t07_abstraction\*.java; if ($LASTEXITCODE -eq 0) { java -cp out t07_abstraction.Main }