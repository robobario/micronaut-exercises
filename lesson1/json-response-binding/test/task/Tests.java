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
        testParameter(1.5d);
    }


    @Test
    public void anotherTest() {
        testParameter(2.5d);
    }


    private void testParameter(Double price) {
        try {
            MutableHttpRequest<Object> request = HttpRequest.POST("/post", price.toString());
            String retrieve = client.toBlocking().retrieve(request);
            String expected = "{\"price\":" + price + "}";
            Assertions.assertEquals(expected, retrieve);
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /post failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /post failed with exception " + e.getMessage(), e);
        }
    }
}