package com.Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        //performed shopping operations and choose bank transfer to pay the bill
        com.Behavioural.Strategy.Payment payment=new com.Behavioural.Strategy.BankTransfer();
        payment.pay();
    }
}
