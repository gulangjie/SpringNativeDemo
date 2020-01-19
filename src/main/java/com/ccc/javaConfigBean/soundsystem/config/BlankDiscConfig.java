package main.java.com.ccc.javaConfigBean.soundsystem.config;

import main.java.com.ccc.javaConfigBean.soundsystem.pojo.BlankDisc;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlankDiscConfig {

    @Bean
    public CompactDisc blankDisc(){
        return new BlankDisc();
    }
}
