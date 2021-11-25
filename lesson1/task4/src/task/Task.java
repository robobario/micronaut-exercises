package task;

import io.micronaut.http.annotation.*;

@Controller("/authenticate")
public class Task {

    @Get()
    public String index() {
        return "How do I respond headers?";
    }

}