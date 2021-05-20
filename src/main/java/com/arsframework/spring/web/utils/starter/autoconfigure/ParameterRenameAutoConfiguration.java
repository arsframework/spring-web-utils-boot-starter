package com.arsframework.spring.web.utils.starter.autoconfigure;

import java.util.List;

import com.arsframework.spring.web.utils.param.ParameterRenamingProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The config of parameter rename with GET method
 *
 * @author Woody
 * @date 2020/11/10
 */
@Configuration
public class ParameterRenameAutoConfiguration implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(this.parameterRenamingProcessor());
    }

    @Bean
    public ParameterRenamingProcessor parameterRenamingProcessor() {
        return new ParameterRenamingProcessor();
    }
}
