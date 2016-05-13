/**
 * 
 */
package hello;

import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.net.URLClassLoader;
/**
 * @author Edwin Yaqub
 *
 */

@RestController
public class SampleController {
	
	@RequestMapping("/hello")
    String home() {
        return "Hello World from SpringBoot - SampleController class!";
    }
	
	public void classPath(){
    	StringBuffer classpath = new StringBuffer();
        ClassLoader applicationClassLoader = this.getClass().getClassLoader();
        if (applicationClassLoader == null) {
            applicationClassLoader = ClassLoader.getSystemClassLoader();
        }
        URL[] urls = ((URLClassLoader)applicationClassLoader).getURLs();
         for(int i=0; i < urls.length; i++) 
         {
             classpath.append(urls[i].getFile()).append("\r\n");
         }    
       System.out.println(classpath.toString());
	}
	
	/*
	public static void main(String[] args) throws Exception {
		SampleController object = new SampleController();
		//object.classPath();
		object.printProperties();
        //SpringApplication.run(SampleController.class, args);
		//new SpringApplicationBuilder(SampleController.class).web(true).run(args);
    }
	 */
}
