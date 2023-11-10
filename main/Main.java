package main;

import Modelos.Music;
import Modelos.MyPreferences;
import Modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();

        myMusic.setTitle("Elastic heath");
        myMusic.setSinger("SIA");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();

        myPodcast.setTitle("BolhaDev");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 100; i++) {
            myPodcast.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            myPodcast.like();
        }

        MyPreferences preference = new MyPreferences();

        preference.include(myPodcast);
        preference.include(myMusic);
    }
}