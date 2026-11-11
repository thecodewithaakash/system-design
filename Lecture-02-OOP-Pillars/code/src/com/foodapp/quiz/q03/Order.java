package com.foodapp.quiz.q03;

import java.util.ArrayList;
import java.util.List;

// The Lecture 1 Order: private list, but the getter hands out the real list
class Order {
    private final List<MenuItem> items = new ArrayList<>();

    void addItem(MenuItem item) {
        if (items.size() >= 20) {
            throw new IllegalStateException("Max 20 items");
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
        return items;
    }
}
