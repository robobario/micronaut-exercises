# Response Code alternative

We can also use an annotation to set the response of the method. 

See the docs [here](https://docs.micronaut.io/latest/guide/#statusAnnotation)
## Task

Make the index method of the [Task controller](course://lesson1/response-code/src/task/Task.java) respond with 204 No Content using an annotation on the method instead of responding with an HttpResponse.

See the annotation <a href="psi_element://io.micronaut.http.annotation.Status">@Status</a> 