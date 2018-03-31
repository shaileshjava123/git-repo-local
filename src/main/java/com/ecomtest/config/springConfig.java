package com.ecomtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ecomtest.dao.UserDetails;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.ecomtest" })
public class springConfig extends WebMvcConfigurerAdapter {

	
//	@Bean
//	@Scope("prototype")
//	public UserDetails getUserDetails() {
//
//		return new UserDetails();
//	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver vr = new InternalResourceViewResolver();

		// vr.setPrefix("/WEB-INF/");//the path of the view page is written
		// //here it provides if it is inside the web-inf folder eg:inside
		// webinf lyes the home.jsp

		vr.setSuffix(".jsp");

		return vr;
	}

	

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/");
	}

}
