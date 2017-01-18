package pkg;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class Animal {

    private final Sound sound;

//    @Autowired
//    public Animal(Sound sound) {
//        System.out.println("Constructing ANIMAL bean");
//        this.sound = sound;
//    }

    public String makeSound() {
        return sound.make();
    }
}
