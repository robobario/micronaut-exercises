package task;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.concurrent.ArrayBlockingQueue;

@Controller("/serviceQuery")
public class Task {

    public static ArrayBlockingQueue<String> strings = new ArrayBlockingQueue<>(2);

    @Get
    public String index() {
        return String.join(",", strings);
    }

}