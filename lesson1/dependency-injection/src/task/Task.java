package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/serviceQuery")
public class Task {

    private Service service;

    public Task() {
    }

    @Get
    public String index() {
        return "How do I get the response from the service?";
    }

}