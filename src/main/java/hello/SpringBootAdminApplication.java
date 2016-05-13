/**
 * 
 */
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * @author Edwin Yaqub
 *
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
//@EnableZuulProxy
//@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminApplication {
	
    public static void main(String[] args) {
      SpringApplication.run(SpringBootAdminApplication.class, args);
    }
    
}
