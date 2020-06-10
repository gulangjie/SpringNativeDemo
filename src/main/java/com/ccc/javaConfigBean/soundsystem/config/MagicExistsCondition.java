package main.java.com.ccc.javaConfigBean.soundsystem.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        Environment env = context.getEnvironment();
//        return env.containsProperty("magic");
        System.out.println(metadata.isAnnotated("PropertySource"));
        return metadata.isAnnotated("PropertySource");
    }
}
