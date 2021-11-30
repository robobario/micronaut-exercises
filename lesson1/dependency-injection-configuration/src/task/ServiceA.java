package task;

import jakarta.inject.Singleton;

import java.util.concurrent.atomic.AtomicLong;

@Singleton
public class ServiceA{

    String response;

    private static AtomicLong counter = new AtomicLong(1);

    ServiceA(){
       response = String.valueOf(counter.getAndIncrement());
    }

    public String getResponse() {
        return response;
    }
}
