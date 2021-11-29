package task;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

@Controller("/responseCode")
public class Task {

    @Get
    public String index() {
        return "How do I respond 204";
    }

}