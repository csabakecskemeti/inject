import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by kecso on 1/18/17.
 */
@ComponentScan
public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Animal animal = context.getBean(Animal.class);
        System.out.println("Animal bean: " + animal.makeSound());
    }
}
