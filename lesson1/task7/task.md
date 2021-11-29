# Query Parameter

We often want to access query parameters.

For example in an URL like `http://api.ducks.nz/ducks?offset=20&limit=10` we will probably want to get at the values of the `offset` and `limit` query parameters.

## Task

Make the index method of the [Task controller](course://lesson1/task7/src/task/Task.java) respond with the value of the `offset` query parameter.

i.e it will receive a request like `/queryParam?offset=2` and respond with `2`

Use the <a href="psi_element://io.micronaut.http.annotation.QueryValue">@QueryValue</a>  annotation. Interestingly this annotation can be used to target query parameters or named path variables.