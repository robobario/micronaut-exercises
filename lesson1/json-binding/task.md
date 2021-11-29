# JSON Body Binding

We often build APIs that consume and produce [JSON](https://en.wikipedia.org/wiki/JSON#Syntax).

Micronaut by default is wired up to consume and produce JSON using jackson to marshall to and from java objects.

## Task

Wire the index method of the [Task controller](course://lesson1/json-binding/src/task/Task.java) to respond with the price posted to it. You can change the type from `String` to `PricedThing`.

The test will post:
```json
{
  "price": 1.5
}
```

and the controller should respond with the string `1.5`