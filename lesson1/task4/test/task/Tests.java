package task;

import io.micronaut.http.HttpRequest;
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
        testPost("superior-apple");
    }


    @Test
    public void anotherTest() {
        testPost("excellent-quality");
    }


    private void testPost(String body) {
        try {
            String retrieve = client.toBlocking().retrieve(HttpRequest.POST("/apples/ambrosia", body));
            Assertions.assertEquals(body, retrieve);
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /hello failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /hello failed with exception " + e.getMessage(), e);
        }
    }
}