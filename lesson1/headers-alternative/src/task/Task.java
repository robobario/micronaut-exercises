package task;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.*;

@Controller("/authenticate")
public class Task {

    @Get()
    public String index(HttpRequest<String> request) {
        return "How do I respond headers?";
    }

}