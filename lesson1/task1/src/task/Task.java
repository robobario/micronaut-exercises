package task;

import io.micronaut.http.annotation.Controller;

@Controller("/hello")
public class Task {

    public String index(){
        return "Hello, world!";
    }

}