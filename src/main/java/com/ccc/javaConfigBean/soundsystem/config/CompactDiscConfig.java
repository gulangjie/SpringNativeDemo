package main.java.com.ccc.javaConfigBean.soundsystem.config;

import main.java.com.ccc.javaConfigBean.soundsystem.pojo.BlankDisc;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CompactDisc;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscConfig {
//    @Bean
//    public CompactDisc sgtPpers(){
//        return new SgtPeppers();
//    }
    @Bean
    public CompactDisc blankDisc(){
        return new BlankDisc();
    }
}
