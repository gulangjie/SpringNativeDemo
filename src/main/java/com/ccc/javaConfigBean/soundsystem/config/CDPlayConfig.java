package main.java.com.ccc.javaConfigBean.soundsystem.config;

import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CDPlayer;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.CompactDisc;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.MediaPlayer;
import main.java.com.ccc.javaConfigBean.soundsystem.pojo.SgtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@Configuration
//扫描basePackages包，自动装备Bean  方式一
//@ComponentScan(basePackages = {"main.java.com.ccc.javaConfigBean.soundsystem.pojo", "main.java.com.ccc.javaConfigBean.soundsystem.test"})
//扫描固定的类
//@ComponentScan(basePackageClasses = {MediaPlayer.class})
//public class CDPlayConfig {
//}

//通过Java代码手动装配Bean
//@Import(CompactDiscConfig.class)
@PropertySource("classpath:main/resources/app.properties")
//@Profile("dev")
public class CDPlayConfig{

    @Autowired
    Environment env;

    @Bean
    @Primary
    public CompactDisc sgtPepper() {
        return new SgtPeppers(env.getProperty("disc.title1"),env.getProperty("disc.artist1"));
    }

    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    @Scope(value=WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.TARGET_CLASS)
//    @Conditional(MagicExistsCondition.class)
    public MediaPlayer cdPlayer(){
        return new CDPlayer(sgtPepper());
    }
}
