package com.company;

public class NotjustOk implements Observer {
    public void update(Artiste artiste){
        System.out.println("Artiste: " + artiste.getArtisteName() + " releases " + artiste.getSongTitle());
    }
}
