package vn.com.tienvn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({"vn.com.tienvn"})
@Import({SpringSecurityConfig.class})
public class SpringConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolve(){
		InternalResourceViewResolver views = new InternalResourceViewResolver();
		views.setViewClass(JstlView.class);
		views.setPrefix("/WEB-INF/views/jsp/");
		views.setSuffix(".jsp");
		return views;
	}
	
	
	
}
