# Headers

Another common task you might want to do is access the HTTP headers. These are sort of meta-data sent in the HTTP request. They might carry authorization tokens, or describe what types of content the client is sending or is able to receive.

See the binding annotations [here](https://docs.micronaut.io/latest/guide/#_binding_annotations) to see how to access a header via an annotated method parameter.

Alternatively you could bind in a micronaut interface into the method as described [here](https://docs.micronaut.io/latest/guide/#requestResponse) and use the HttpRequest to access the headers.

## Task

Update the Task controller to respond with the Authorization header posted to it.