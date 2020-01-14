package main.java.com.ccc.javaConfigBean.soundsystem.pojo;

import javax.inject.Named;

//@Component("lonelyHeartsClub")
@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
