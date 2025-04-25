package com.Behavioural.Observer;

public class Client {
    public static void main(String[] args) {
        String news="Breaking news:Kashmir bombed";
        com.Behavioural.Observer.NewsAgency agency=new com.Behavioural.Observer.NewsAgency(){};

        agency.registerObserver(new com.Behavioural.Observer.EmailSubscriber());
        agency.registerObserver(new com.Behavioural.Observer.MobileSubscriber());
        agency.publishNews(news);

    }
}
