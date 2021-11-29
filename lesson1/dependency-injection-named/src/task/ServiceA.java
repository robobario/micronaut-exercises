package task;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("serviceA")
public class ServiceA implements Service {

    public static final String RESPONSE_A = "response from service a";

    @Override
    public String getResponse(){
        return RESPONSE_A;
    }

}
