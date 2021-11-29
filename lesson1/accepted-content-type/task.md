# Accepted Content Type

By default when you declare a POST controller it is configured to accept application/json content type. It will respond with an Unsupported Media Type code if the Http Request declares the content is something else.

See the docs [here](https://docs.micronaut.io/latest/guide/#consumesAnnotation) to see how you can configure your controller to accept other mime types.

## Task

Make the index method of the [Task controller](course://lesson1/accepted-content-type/src/task/Task.java) respond with the value posted to it, the test is setting the Content-Type to `application/xml` which is rejected by default.