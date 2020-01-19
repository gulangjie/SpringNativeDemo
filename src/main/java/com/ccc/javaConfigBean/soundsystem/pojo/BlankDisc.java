package main.java.com.ccc.javaConfigBean.soundsystem.pojo;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    private List<String> tracks;

    public BlankDisc(){}

//    用于测试构造注入时使用
    public BlankDisc(String title, String artist, List<String> tracks){
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }
}
