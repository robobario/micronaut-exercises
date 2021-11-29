package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Controller("/serviceQuery")
public class Task {

    private Service service;

    @Inject
    public Task(@Named("serviceA") Service service) {
        this.service = service;
    }

    @Get
    public String index() {
        return service.getResponse();
    }

}