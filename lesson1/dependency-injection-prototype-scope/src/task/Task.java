package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.concurrent.ArrayBlockingQueue;

@Controller("/serviceQuery")
public class Task {

    private final ServiceA a;
    private final ServiceA b;

    public Task(
            ServiceA a,
            ServiceA b
    ) {
        this.a = a;
        this.b = b;
    }

    @Get
    public String index() {
        return a.getResponse() + "," + b.getResponse();
    }
    
    @Get("/same")
    public String same() {
        return String.valueOf(a == b);
    }

}