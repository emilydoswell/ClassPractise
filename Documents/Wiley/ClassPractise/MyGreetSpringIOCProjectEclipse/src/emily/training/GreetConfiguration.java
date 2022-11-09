package emily.training;

import emily.demo.GoodAfterNoon;
import emily.demo.GoodMorning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class GreetConfiguration {
	@Bean(name = "mrng")
	public GoodMorning getGoodMoring() {
		return new GoodMorning();
	}
	
	public GoodAfterNoon getGoodAfterNoon() {
        return new GoodAfterNoon();
    }
}
