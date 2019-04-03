package com.company;


public interface Observable{
    void register(Observer observer);
    void removeob(Observer observer);
    void notifyObserver();
}
