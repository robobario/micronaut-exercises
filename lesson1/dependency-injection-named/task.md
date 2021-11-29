# Dependency Injection - named qualifier

When there is only one bean with a specific interface or class in the context Micronaut knows what to inject. But if there is more than one candidate we need to tell it which bean to inject. One way is to use the <a href="psi_element://jakarta.inject.Named">Named</a> qualifier annotation in the constructor. There are also matching annotations on the Singletons to give them string names.

See the docs [here](https://docs.micronaut.io/latest/guide/#_qualifying_by_name), note if you follow their class naming pattern you can refer to XyzService implementation of Service as "xzy".
## Task

Update the [Task](course://lesson1/dependency-injection/src/task/Task.java) controller to wire in ServiceB instead of A.