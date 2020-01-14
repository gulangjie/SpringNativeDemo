package main.java.com.ccc.javaConfigBean.soundsystem.config;

import main.java.com.ccc.javaConfigBean.soundsystem.pojo.MediaPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描basePackages包
//@ComponentScan(basePackages = {"main.java.com.ccc.javaConfigBean.soundsystem.pojo", "main.java.com.ccc.javaConfigBean.soundsystem.test"})
//扫描固定的类
@ComponentScan(basePackageClasses = {MediaPlayer.class})
public class CDPlayConfig {
}
