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
        testHeader("superSecure");
    }


    @Test
    public void anotherTest() {
        testHeader("quiteAuthenticated");
    }

    @Test
    public void nullTest() {
        testHeader(null);
    }


    private void testHeader(String header) {
        try {
            MutableHttpRequest<Object> request = HttpRequest.GET("/authenticate");
            if (header != null) {
                request.header("Authorization", header);
            }
            String retrieve = client.toBlocking().retrieve(request);
            String expectation = header == null ? "missing" : header;
            Assertions.assertEquals(expectation, retrieve);
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /hello failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /hello failed with exception " + e.getMessage(), e);
        }
    }
}