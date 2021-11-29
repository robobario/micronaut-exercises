package task;

import io.micronaut.context.annotation.Context;
import jakarta.inject.Named;

@Context
@Named("serviceB")
public class ServiceB implements Service {

    ServiceB(){
        Task.strings.offer("A gift from ServiceB");
    }

}
