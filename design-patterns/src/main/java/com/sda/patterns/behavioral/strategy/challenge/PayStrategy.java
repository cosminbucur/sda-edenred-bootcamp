package com.sda.patterns.behavioral.strategy.challenge;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
