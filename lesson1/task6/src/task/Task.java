package task;

import io.micronaut.http.annotation.*;

@Controller("/authenticate")
public class Task {

    @Get()
    public String index(@Header String authorization) {
        return authorization;
    }

}