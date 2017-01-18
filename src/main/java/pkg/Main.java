package pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        ApplicationContext context = new AnnotationConfigApplicationContext("pkg");
        Animal animal = context.getBean(Animal.class);
        System.out.println("pkg.Animal bean: " + animal.makeSound());
    }


}
