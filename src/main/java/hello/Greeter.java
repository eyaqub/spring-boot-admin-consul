/**
 * 
 */
package hello;

import org.springframework.stereotype.Component;

/**
 * @author Edwin Yaqub
 *
 */
@Component
public class Greeter {

	/**
	 * 
	 */
	public Greeter() {
		System.out.println("Inside Greeter()");
	}
	
	public String sayHello() {
	    return "Hello world from Greeter class!";
	}

}
