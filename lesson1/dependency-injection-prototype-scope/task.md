# Dependency Injection - prototype scope

So far we have looked at <a href="psi_element://jakarta.inject.Singleton">@Singleton</a> and <a href="psi_element://io.micronaut.context.annotation.Context">@Context</a> beans which are both instantiated once per context.

Another thing you can do is tell the Context to instantiate a new instance of your bean where-ever it is injected.

To do this you use <a href="psi_element://io.micronaut.context.annotation.Prototype">@Prototype</a> scope.

# Task

Modify ServiceA so that two different instances are injected into Task. Currently it is annotated as a Singleton so only a single instance is constructed and wired into the Task controller.