# Hello World controller

Micronaut provides many components that can be used independently. One common one we use is the micronaut-http-server. It is [documented here](https://docs.micronaut.io/latest/guide/#httpServer)

The gradle build configures a micronaut annotation processor that looks for annotations like <a href="psi_element://io.micronaut.http.annotation.Controller">@Controller</a> and generates the routing and dependency injection code that will connect HTTP requests to our controller.

## Task

The first task is a Hello World, we need to add a missing annotation to the <a href="psi_element://task.Task#index">index</a> method, so GET requests are routed to it.