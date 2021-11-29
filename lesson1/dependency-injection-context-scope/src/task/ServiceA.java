package task;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("serviceA")
public class ServiceA implements Service {

    ServiceA(){
        Task.strings.offer("A gift from ServiceA");
    }


}
