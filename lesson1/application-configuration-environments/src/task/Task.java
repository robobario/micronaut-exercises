package task;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/serviceQuery")
public class Task {

    private String prop;

    public Task(@Value("${propB}") String prop) {
        this.prop = prop;
    }

    @Get
    public String index() {
        return prop;
    }

}