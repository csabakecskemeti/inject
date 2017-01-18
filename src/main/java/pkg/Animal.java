package pkg;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class Animal {

    private final Sound sound;

    public String makeSound() {
        return sound.make();
    }
}
