# Query Parameter

We often want to access query parameters.

For example in an URL like `http://api.ducks.nz/ducks?offset=20&limit=10` we will probably want to get at the values of the `offset` and `limit` query parameters.

## Task

Make the index method of the [Task controller](course://lesson1/task6/src/task/Task.java) respond with the value of the `offset` query parameter.

i.e it will receive a request like `/queryParam?offset=2` and respond with `2`
