package t03_encapsulation;

import java.util.ArrayList;
import java.util.List;

// The Lecture 1 order,trimmed down. the field is private, but look at getItems() - it returns a reference to the private field, so the encapsulation is broken. The user can modify the list of items in the order.

// class Order {
//     static final int MAX_ITEMS = 20;

//     private final List<MenuItem> items = new ArrayList<>();

//     void addItem(MenuItem item) {
//         if (items.size() >= MAX_ITEMS) {
//             throw new IllegalStateException("An order can have at most " + MAX_ITEMS + " items");
//         }
//         items.add(item);
//     }

//     double getTotalAmount() {
//         double total = 0;
//         for (MenuItem item : items) {
//             total += item.getPrice();
//         }
//         return total;
//     }

//     List<MenuItem> getItems() {
//         return items;  // this is a reference to the private field, so the encapsulation is broken. The user can modify the list of items in the order.
//     }
// }


// ### fixing the encapsulation issue by returning an unmodifiable list in getItems() method. This way, the user can only read the list of items, but cannot modify it.
import java.util.ArrayList;
import java.util.Collections;                               // new
import java.util.List;

class Order {
    static final int MAX_ITEMS = 20;

    private final List<MenuItem> items = new ArrayList<>(); 

    void addItem(MenuItem item) {
        if (items.size() >= MAX_ITEMS) {
            throw new IllegalStateException("An order can have at most " + MAX_ITEMS + " items");
        }
        items.add(item);
    }

    double getTotalAmount() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    List<MenuItem> getItems() {
        // If getItems() returns the actual ArrayList reference, encapsulation is broken because external code can directly modify the internal list using methods such as .add(), .remove(), or .clear().

        // return items; // here we are returning the reference of the private field "items" to the user. So, the user can modify the list of items in the order. So, we will return an unmodifiable list instead of the actual list to achieve encapsulation.


    // To fix the encapsulation issue, we can return an unmodifiable view of the list using Collections.unmodifiableList(). This way, the user can only read the list of items, but cannot modify it.
        return Collections.unmodifiableList(items);         // new
    }
}
