package com.company;

public class Main {

    public static void main(String[] args) {
	  Artiste upload = new Artiste();
	  Website notjustok = new Website("notjustok.com");
	  Website itunes = new Website("itunes.com");
	  Website spotify = new Website("spotify.com");
	  upload.register(notjustok);
	  upload.register(itunes);
	  upload.register(spotify);

	  upload.addSong("thotiana", "blueface");


    }
}
