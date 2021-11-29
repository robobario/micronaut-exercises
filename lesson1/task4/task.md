# POST alternative - use the HttpRequest interface

Alternatively, instead of using the @Body to wire in the body from the request, you can work with the HttpRequest interface.

You can bind in a micronaut interface into the method as described [here](https://docs.micronaut.io/latest/guide/#requestResponse) and use the HttpRequest to access the headers.
## Task

Update the Task controller to respond with the body posted to it. Use the `@Body` annotation.