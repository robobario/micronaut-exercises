package task;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("serviceB")
public class ServiceB implements Service {

    public static final String RESPONSE_B = "response from service b";

    @Override
    public String getResponse(){
        return RESPONSE_B;
    }

}
