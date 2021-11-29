package task;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
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
        testPost("aepple");
    }


    @Test
    public void anotherTest() {
        testPost("banaenae");
    }


    private void testPost(String body) {
        try {
            MutableHttpRequest<Object> request = HttpRequest.POST("/post", body);
            request.getParameters().add("offset", body);
            request.contentType(MediaType.APPLICATION_XML_TYPE);
            String retrieve = client.toBlocking().retrieve(request);
            String expectation = body == null ? "missing" : body;
            Assertions.assertEquals(expectation, retrieve);
        } catch (HttpClientResponseException e) {
            Assertions.fail("Posting " + body + " to /post failed with response " + e.getResponse().status());
        } catch (Exception e) {
            Assertions.fail("Posting " + body + " to /post failed with exception " + e.getMessage(), e);
        }
    }
}