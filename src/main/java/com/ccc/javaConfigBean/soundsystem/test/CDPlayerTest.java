package main.java.com.ccc.javaConfigBean.soundsystem.test;

import main.java.com.ccc.javaConfigBean.soundsystem.config.CDPlayConfig;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CompactDisc;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" +
                        " by The Beatles",log.getLog());
    }

}
