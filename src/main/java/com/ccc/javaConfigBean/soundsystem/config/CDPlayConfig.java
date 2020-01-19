package main.java.com.ccc.javaConfigBean.soundsystem.config;

import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CDPlayer;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CompactDisc;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.MediaPlayer;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//扫描basePackages包，自动装备Bean  方式一
//@ComponentScan(basePackages = {"main.java.com.ccc.javaConfigBean.soundsystem.pojo", "main.java.com.ccc.javaConfigBean.soundsystem.test"})
//扫描固定的类
//@ComponentScan(basePackageClasses = {MediaPlayer.class})
//public class CDPlayConfig {
//}

//通过Java代码手动装配Bean
@Import(CompactDiscConfig.class)
public class CDPlayConfig{
//    @Bean
//    public CompactDisc sgtPepper(){
//        return new SgtPeppers();
//    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
