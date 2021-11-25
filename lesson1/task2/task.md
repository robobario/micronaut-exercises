# Path Variables

Something you often want to do with any web frameworks is access portions of the path.

For example:

```GET /monkeys/123```

We may want to get the id 123 from the path to do a lookup. 

Instead of having to parse the path, frameworks often have some concept of Path Variables.

The task is to make the controller respond with 123 when it receives a request to `monkeys/123`

See the docs [here](https://docs.micronaut.io/latest/guide/#_uri_path_variables) to see how to route path variables.