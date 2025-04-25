package com.Behavioural.Strategy;

public class BankTransfer implements com.Behavioural.Strategy.Payment {
    @Override
    public void pay() {
        System.out.println("Paid using bank transfer");
    }
}
