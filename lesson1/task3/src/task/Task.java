package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/apples")
public class Task {

    @Post("/{id}")
    public String index() {
        return "How do I respond body?";
    }

}