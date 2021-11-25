# POST

Having tamed GET we can now do POST. (See [here](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods) for more about common HTTP methods).

POST is a common way to send data to an endpoint.

For example you might wish to update the price of an apple by POSTing:

```json
{
  "price": 3.50
}
```
to `http://apples.com/apple/ambrosia`

See the micronaut docs [here](https://docs.micronaut.io/latest/guide/#bodyAnnotation) to find our how to annotate up your method to receive the post body.

Alternatively you could bind in some micronaut interfaces into the method as described [here](https://docs.micronaut.io/latest/guide/#requestResponse) and use the HttpRequest to access the body.

## Task

Update the Task controller to respond with the body posted to it.