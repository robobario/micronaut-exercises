# Dependency Injection - context scope

So far we have been annotating our beans with @Singleton which means only a single instance will be instantiated and injected.

This is lazy, so if nothing depends on our @Singleton bean it will not be constructed. Not ideal if you want it to do some work on startup.

An alternative to the @Singleton scope is @Context:
> Context scope indicates that the bean will be created at the same time as the ApplicationContext (eager initialization)

See scopes documentation [here](https://docs.micronaut.io/latest/guide/#scopes).

## Task
Update ServiceA so that it is eagerly instantiated, which will cause it to push a string to the Task controller.