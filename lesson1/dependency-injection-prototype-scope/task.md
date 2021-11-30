# Dependency Injection - factory classes

Another common thing we might want to do is instantiate some java classes that we have pulled in from third-party libraries. They likely don't have micronaut/jakarta annotations so we want a way to instantiate them and make them available for injection.

For this we can annotate a class with <a href="psi_element://io.micronaut.context.annotation.Factory">@Factory</a> like so:

```java
@Factory
class WidgetFactory {

    @Singleton
    Widget widget() {
        return new Widget();
    }
}
```

See docs [here](https://docs.micronaut.io/latest/guide/#factories)

## Task

Modify the BeanConfiguration class to:
1. annotate the stringB method so it's result is a named singleton
2. wire stringB into the `serviceA` method by changing the name in the `@Named` parameter