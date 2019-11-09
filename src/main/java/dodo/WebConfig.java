package dodo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = {"dodo"})
@EnableWebMvc
public class WebConfig implements  WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("test",".jsp");
    }
}
