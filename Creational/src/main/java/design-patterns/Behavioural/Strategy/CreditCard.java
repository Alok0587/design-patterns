package com.Behavioural.Strategy;

public class CreditCard implements com.Behavioural.Strategy.Payment {

    @Override
    public void pay() {
        System.out.println("Paid suing credit card");
    }
}
