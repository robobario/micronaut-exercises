# JSON Response Binding

We often build APIs that consume and produce [JSON](https://en.wikipedia.org/wiki/JSON#Syntax).

Micronaut also produces JSON by default and will convert your plain java objects to JSON using jackson.

## Task

Wire the index method of the [Task controller](course://lesson1/json-response-binding/src/task/Task.java) to respond with json containing the price posted to it.

The test will post:
```
1.5
```

and the controller should respond with the string `{ "price" = 1.5 }` using a java object as the response type of the index method.

You can change the response type of index from String to PricedThing.