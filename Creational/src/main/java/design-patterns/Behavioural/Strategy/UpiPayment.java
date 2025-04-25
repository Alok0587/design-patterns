package com.Behavioural.Strategy;

public class UpiPayment implements com.Behavioural.Strategy.Payment {
    @Override
    public void pay() {
        System.out.println("paid using UPI");
    }
}
