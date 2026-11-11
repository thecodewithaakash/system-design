package com.foodapp.quiz.q06;

class CardPayment extends Payment {

    // Typo: getDetail, not getDetails. Uncomment @Override to see the compiler catch it.
    // @Override
    String getDetail() {
        return "Card ending 4242";
    }
}
