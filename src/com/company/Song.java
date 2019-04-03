package com.company;

public class Song{
    private String title;
    private String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    protected String getSongTitle(){
        return title;
    }

    protected String getSongArtist(){
        return artist;
    }
}
