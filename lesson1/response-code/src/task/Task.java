package task;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

@Controller("/responseCode")
public class Task {

    @Get
    public HttpResponse<?> index() {
        return HttpResponse.ok("how do I respond 204?");
    }

}