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
            Assertions.assertEquals("1,2", retrieve, "unexpected response from /serviceQuery");
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /serviceQuery failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /serviceQuery failed with exception " + e.getMessage(), e);
        }
    }

    @Test
    public void testSame() {
        try {
            MutableHttpRequest<Object> request = HttpRequest.GET("/serviceQuery/same");
            String retrieve = client.toBlocking().retrieve(request);
            Assertions.assertEquals("false", retrieve, "unexpected response from /serviceQuery/same");
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /serviceQuery failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /serviceQuery failed with exception " + e.getMessage(), e);
        }
    }


}