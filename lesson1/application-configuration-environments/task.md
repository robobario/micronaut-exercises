# Application Configuration Environments

Micronaut will get it's base configuration from application.yml (or the other base formats), then it has a concept of active environments. By default when you run unit tests there is a `test` environment activated. This means if you have an `application-test.yml` on the classpath then properties from that file will override what's in application.yml

See the docs [here](https://docs.micronaut.io/latest/guide/#environments) for more about environments and how it resolves properties.

## Task

In this task the test explicitly activates an environment named `crazyenv`. Add an override for propB to `application-crazyenv.yml` to make the test go green.