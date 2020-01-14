package main.java.com.ccc.javaConfigBean.soundsystem.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class CDPlayer implements MediaPlayer {

//    1、Autowired使用在private上
//    @Autowired
//    private CompactDisc sgtPeppers;

    private CompactDisc sgtPeppers;

    @Autowired(required = false)
    public CDPlayer(CompactDisc sgtPeppers){
        this.sgtPeppers = sgtPeppers;
    }

    @Override
    public void play() {
        sgtPeppers.play();
    }
}
