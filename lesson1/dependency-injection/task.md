# Dependency Injection

Micronaut provides [inverson-of-control](https://docs.micronaut.io/latest/guide/#ioc). This is where we rely on the framework to call into our code. So we might declare a class that requires some dependency plugged into it's constructor, but it is up to the micronaut framework to construct both objects and make the constructor calls for us.

This gives the framework a lot of power to do things like replace our plain objects with proxies that implement functionality like automatic retries.

Micronaut implements most of this by reading the annotations from our classes at compile time and constructing java classes that do the work. They try to avoid dynamic proxies and reflection as much as possible which helps micronaut have a fast startup and some other benefits.

## Task

Wire in the [Service](course://lesson1/dependency-injection/src/task/Service.java) into the [Task](course://lesson1/dependency-injection/src/task/Task.java) controller using the <a href="psi_element://jakarta.inject.Inject">@Inject</a> annotation and return the result of Service::getResponse from the `index` method of the controller.