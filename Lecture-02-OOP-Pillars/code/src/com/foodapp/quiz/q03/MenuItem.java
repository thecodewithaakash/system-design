package com.foodapp.quiz.q03;

class MenuItem {
    private final String name;
    private final double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}
