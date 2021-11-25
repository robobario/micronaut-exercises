package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/monkeys")
public class Task {

    @Get("{id}")
    public String index() {
        return "How do I use the id?";
    }

}