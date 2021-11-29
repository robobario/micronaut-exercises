# Headers - alternative

Alternatively you can wire in the HttpRequest and use that to access the headers.

You can bind in a micronaut interface into the method as described [here](https://docs.micronaut.io/latest/guide/#requestResponse) and use the HttpRequest to access the headers.

## Task

Update the Task controller to respond with the Authorization header posted to it. Using the HttpRequest wired into the method.