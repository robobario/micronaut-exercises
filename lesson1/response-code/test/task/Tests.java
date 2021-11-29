package task;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
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
            MutableHttpRequest<Object> request = HttpRequest.GET("/responseCode");
            request.getParameters().add("offset", "superSecure");
            HttpResponse<String> retrieve = client.toBlocking().exchange(request);
            Assertions.assertEquals(HttpStatus.NO_CONTENT, retrieve.status(), "unexpected http response code returned");
        } catch (HttpClientResponseException e) {
            Assertions.fail("Request to /responseCode failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Request to /responseCode failed with exception " + e.getMessage(), e);
        }
    }

}