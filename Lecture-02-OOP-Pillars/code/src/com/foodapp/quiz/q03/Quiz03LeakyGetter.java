package com.foodapp.quiz.q03;

import java.util.List;

// Frame 03 PREDICT. Expected output: 0.0
public class Quiz03LeakyGetter {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new MenuItem("Masala Dosa", 120));
        order.addItem(new MenuItem("Paneer Tikka", 250));

        List<MenuItem> items = order.getItems();
        items.clear();

        System.out.println(order.getTotalAmount());
    }
}
