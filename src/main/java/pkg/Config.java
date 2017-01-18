package pkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kecso on 1/18/17.
 */
@Configuration
public class Config {


    @Bean
    public Food food() {
        System.out.println("Constructing FOOD bean");
        return new Food();
    }
}
