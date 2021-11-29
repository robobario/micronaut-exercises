package task;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/apples")
public class Task {

    @Post("/{id}")
    public String index(HttpRequest<String> request) {
        return "How do I respond body?";
    }

}