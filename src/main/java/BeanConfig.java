import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kecso on 1/18/17.
 */
@Configuration
public class BeanConfig {

    @Autowired
    Sound sound;

    @Bean(autowire = Autowire.BY_TYPE)
    public Animal animal() {
        return new Animal(sound);
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public Sound sound() {
        return new Sound();
    }
}
