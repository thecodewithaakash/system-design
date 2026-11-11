package t04_inheritance;

public class Main {
    public static void main(String[] args) {
        // new UpiPayment(410, "rahul@okaxis").pay(); //  this is also correct but we are not able to get the receipt because we are not storing the reference of the object. So, we will store the reference of the object in a variable and then call the pay() method on that variable. This way, we can get the receipt after calling the pay() method.

        UpiPayment upi = new UpiPayment(410, "rahul@okaxis");
        CardPayment card = new CardPayment(250, "4111111111114242");

        upi.pay();                              
        upi.pay(10);
        upi.pay(10,11);
        System.out.println(upi.getReceipt());

        card.pay();                                 // new
        System.out.println(card.getReceipt());
    }
}

// cmd: javac -d out .\t04_inheritance\*.java; if ($LASTEXITCODE -eq 0) { java -cp out t04_inheritance.Main }