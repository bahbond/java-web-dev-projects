package org.launchcode;

public class BeatleQuotes {
    public static void main(String[] args){
        BeatleLyrics lyrics = new BeatleLyrics();
lyrics.message = "'I once had a girl, or should I say, she once had me..'";
lyrics.lyric2 = "'Now the time has come, and so my love I must go..'";

    String beatles = lyrics.beatleMania();
        System.out.println(beatles);

    }
}
