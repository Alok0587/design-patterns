package com.Behavioural.Observer;

public interface Subject {
    public void registerObserver(com.Behavioural.Observer.Observer observer);
    public void removeObserver(com.Behavioural.Observer.Observer observer);
    public void notifyObservers(String message);
}
