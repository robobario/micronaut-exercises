package task;

import io.micronaut.http.annotation.*;

@Controller("/queryParam")
public class Task {

    @Get
    public String index() {
        return "How do I use queryParameter";
    }

}