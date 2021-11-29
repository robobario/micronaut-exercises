package task;

import jakarta.inject.Singleton;

@Singleton
public class Service {

    public static final String RESPONSE = "it's the response from the service";

    public String getResponse(){
        return RESPONSE;
    }

}
