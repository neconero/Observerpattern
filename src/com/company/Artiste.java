package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Artiste implements Observable {
    private List<Observer> observer;
    private ArrayList<Song> song;

    public Artiste(){
        observer = new ArrayList<Observer>();
        song = new ArrayList<Song>();
    }

    public void addSong(String songName, String artistName){
        Song track = new Song(songName,artistName);
        song.add(track);
        notifyObserver();
    }

    public void getState(){
        for (Song s: song){
            System.out.println(s.getSongTitle() + " " + s.getSongArtist());
        }
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


}
