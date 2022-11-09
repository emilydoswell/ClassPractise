package emily.training;

import emily.demo.Greet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(GreetConfiguration.class);
	    
		Greet greet=(Greet)springContainer.getBean("mrng");
	    greet.wish("Gemma");
	}

}
