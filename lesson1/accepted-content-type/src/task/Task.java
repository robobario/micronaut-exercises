package task;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/post")
public class Task {

    @Post(consumes = {MediaType.APPLICATION_JSON})
    public String index(@Body String body) {
        return body;
    }

}