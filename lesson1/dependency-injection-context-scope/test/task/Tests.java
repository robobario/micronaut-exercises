package task;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class Tests {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testSolution() {
        try {
            MutableHttpRequest<Object> request = HttpRequest.GET("/serviceQuery");
            String retrieve = client.toBlocking().retrieve(request);
            String message = "expected response to contain 'A gift from ServiceA' but was " + retrieve;
            Assertions.assertTrue(retrieve.contains("A gift from ServiceA"), message);
            String message2 = "expected response to contain 'A gift from ServiceB' but was " + retrieve;
            Assertions.assertTrue(retrieve.contains("A gift from ServiceB"), message2);
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /serviceQuery failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /serviceQuery failed with exception " + e.getMessage(), e);
        }
    }


}