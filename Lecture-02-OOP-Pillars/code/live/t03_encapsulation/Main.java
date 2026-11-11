// package t03_encapsulation;

// public class Main {
//     public static void main(String[] args) {
//         Order order = new Order();

//         order.addItem(new MenuItem("Masala Dosa", 120));
//         order.addItem(new MenuItem("Paneer Tikka", 250));

//         // If getItems() returns the actual ArrayList reference,
//         // encapsulation is broken because external code can directly
//         // modify the internal collection using methods like .add().
//         for (int i = 0; i < 25; i++) {
//             order.getItems().add(new MenuItem("Dosa", 120));

//             // for just understanding:
//             // order.getItems().add(new MenuItem("Dosa", 120)); --> order.items.add(new MenuItem("Dosa", 120)); --> i know this not correct code but just for understanding. because getItems() returns the reference of the private field "items" to the user. So, the user can modify the list of items in the order.
//         }

//         // we got error: Exception in thread "main" java.lang.IllegalStateException: An order can have at most 20 items because we are trying to add more than 20 items in the order. So, we will fix the encapsulation issue by returning an unmodifiable list in getItems() method. This way, the user can only read the list of items, but cannot modify it.


//         System.out.println("Items: " + order.getItems().size());
//         System.out.println("Total: Rs " + order.getTotalAmount());
//     }
// }


// ### final corrected code  

package t03_encapsulation;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem(new MenuItem("Masala Dosa", 120));
        order.addItem(new MenuItem("Paneer Tikka", 250));

    
        System.out.println("Items: " + order.getItems().size());
        System.out.println("Total: Rs " + order.getTotalAmount());
    }
}

// cmd: javac -d out .\t03_encapsulation\*.java; if ($LASTEXITCODE -eq 0) { java -cp out t03_encapsulation.Main }
