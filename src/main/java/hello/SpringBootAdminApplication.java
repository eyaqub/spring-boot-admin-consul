/**
 * 
 */
package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * @author Edwin Yaqub
 *
 */
@Configuration
@EnableAutoConfiguration
//@EnableDiscoveryClient
//@EnableAdminServer
public class SpringBootAdminApplication {
	
    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
    
}
