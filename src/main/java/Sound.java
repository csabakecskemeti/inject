import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kecso on 1/18/17.
 */
@Component
@RequiredArgsConstructor(onConstructor=@__({@Autowired}))
public class Sound {

    public String make() {
        return "woof";
    }
}
