package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Artiste implements Observable {
    private List<Observer> observer;
    private String name;
    private Song song;
    public Artiste(){
        observer = new ArrayList<Observer>();
    }

    public String getArtisteName(){
        return name;
    }
    public void register(Observer observer){
        if(observer != null){
            this.observer.add(observer);
        }
    }
    public void removeob(Observer observer){
        this.observer.remove(observer);
    }
    public void notifyObserver(){
        Iterator<Observer> it = observer.iterator();
        while (it.hasNext()){
            Observer observer = it.next();
            observer.update(this);
        }
    }

    public String getSongTitle(){
        return song.getSongTitle();
    }

    public void update(){
        this.notifyObserver();
    }
}
