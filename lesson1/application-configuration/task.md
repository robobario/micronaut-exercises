# Application Configuration

> Configuration in Micronaut takes inspiration from both Spring Boot and Grails, integrating configuration properties from multiple sources directly into the core IoC container.
>
> Configuration can by default be provided in Java properties, YAML, JSON, or Groovy files. The convention is to search for a file named application.yml, application.properties, application.json or application.groovy.

By default Micronaut will load configuration from these locations.

We can then inject them into our micronaut managed beans using the @Value annotation.

See the docs [here](https://docs.micronaut.io/latest/guide/#valueAnnotation) for more about the @Value annotation.
## Task

Modify the Task controller to get the value of propB from `application.yml` instead of propA