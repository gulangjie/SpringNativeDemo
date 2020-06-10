package main.java.com.ccc.javaConfigBean.soundsystem.pojo;

import org.springframework.beans.factory.annotation.Value;

import javax.inject.Named;

//@Component("lonelyHeartsClub")
@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public SgtPeppers(){}

//    public SgtPeppers(String t, String a){
//        this.title = t;
//        this.artist = a;
//    }

    public SgtPeppers(@Value("${disc.title}")String title,@Value("${disc.artist}")String artist){
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
