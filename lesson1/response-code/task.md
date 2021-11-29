# Response Code

We often want to return a specific HTTP response code

By default micronaut will respond with 200 OK

To customise it we can make our method return an <a href="psi_element://io.micronaut.http.HttpResponse">HttpResponse</a> with the code set. See the docs [here](https://docs.micronaut.io/latest/guide/#statusAnnotation).

## Task

Make the index method of the [Task controller](course://lesson1/response-code/src/task/Task.java) respond with 204 No Content.

See the convenience method <a href="psi_element://io.micronaut.http.HttpResponse#noContent">HttpRequest::noContent</a> 