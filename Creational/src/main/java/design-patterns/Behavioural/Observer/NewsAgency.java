package com.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsAgency implements com.Behavioural.Observer.Subject {
    private final List<com.Behavioural.Observer.Observer> observers=new ArrayList<>();
    @Override
    public void registerObserver(com.Behavioural.Observer.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(com.Behavioural.Observer.Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news){
        for(com.Behavioural.Observer.Observer observer:observers){
            observer.update(news);
        }
    }

    public  void publishNews(String news){
        notifyObservers(news);
    }

}
