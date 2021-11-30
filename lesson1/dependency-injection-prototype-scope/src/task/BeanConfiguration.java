package task;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Factory
public class BeanConfiguration {

    @Singleton
    ServiceA serviceA(@Named("a") String s) {
        return new ServiceA(s);
    }


    @Singleton
    @Named("a")
    String stringA() {
        return "a";
    }


    String stringB() {
        return "b";
    }
}
