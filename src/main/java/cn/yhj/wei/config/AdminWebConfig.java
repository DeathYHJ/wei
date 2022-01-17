package cn.yhj.wei.config;


import cn.yhj.wei.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @package: com.yhj.boot.first.config
 * @ClassName: AdminWebConfig
 * @author: yhj.
 * @date : 2022-01-07 14:04
 **/

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

  /*  @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**",
                        "/fonts/**","/images/**","/js/**",
                        "/layui/**","/lib/**"
                );
                //放行
    }*/

}
