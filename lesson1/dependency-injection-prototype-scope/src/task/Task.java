package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/serviceQuery")
public class Task {

    private final ServiceA service;

    public Task(
            ServiceA a
    ) {
        this.service = a;
    }

    @Get
    public String index() {
        return service.getResponse();
    }


}