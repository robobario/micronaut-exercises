# Optional Headers

Note that if a header is not present it will cause the route to not be hit, it needs to be annotated differently if you want to allow null values for the header. See the docs [here](https://docs.micronaut.io/latest/guide/#_bindable_types) about nulls.

## Task
Make the task controller respond with the string `missing` if the `Authorization` header is not present. Else the value of the header.