```js
// List is mutable by nature in Java.
// If getItems() returns the actual ArrayList reference,
// external code can directly modify the internal state.

public List<MenuItem> getItems() {
    return items; // ❌ Encapsulation broken
}


Example:

Order order = new Order();

order.addItem(new MenuItem("Dosa", 120));

// External code gets direct access
List<MenuItem> items = order.getItems();

items.clear(); // ❌ Removes all items from Order
items.add(new MenuItem("Hacked Item", 0)); // ❌ Modifies internal data


Note:
- Since List/ArrayList is mutable in Java, returning the actual list reference exposes the internal state and breaks encapsulation. External code can modify the list using methods such as add(), remove(), or clear().


Fix:

public List<MenuItem> getItems() {
    return List.copyOf(items); // ✅ Read-only copy
}


or

public List<MenuItem> getItems() {
    return Collections.unmodifiableList(items); // ✅ Unmodifiable view
}

```