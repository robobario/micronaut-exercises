# Query Parameter alternative

Alternatively we can use the HttpRequest.

## Task

Make the index method of the [Task controller](course://lesson1/query-alternative/src/task/Task.java) respond with the value of the `offset` query parameter.

i.e it will receive a request like `/queryParam?offset=2` and respond with `2`

Use the <a href="psi_element://io.micronaut.http.HttpRequest#getParameters">HttpRequest</a>  wired in to get the param.