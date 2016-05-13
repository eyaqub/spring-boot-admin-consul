/**
 * 
 */
package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Service
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static long count = 0;
    
    @Autowired
    private Greeter greeter;
    
    @Autowired
    Environment env;
    
    @RequestMapping("/saymyname")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(++count,  //counter.incrementAndGet()
                            String.format(template, name));
    }
    
    @RequestMapping("/greeting")
    public String getGreeting(){
    	return this.greeter.sayHello();
    }
    
    @RequestMapping("/env")
    public String getEnv(){
    	String env = " ENV ";
    	
    	if( this.env != null )
    	{
    		env += this.env.getDefaultProfiles().toString(); 
    		env += this.env.toString();
    	}
    	return env.toString();
    }
}