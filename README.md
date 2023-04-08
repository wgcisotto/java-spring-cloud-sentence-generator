# Sentence Generator Project 

**A simple project using spring cloud and docker**

- [gateway-server](https://github.com/wgcisotto/gateway-server)
- [config-server](https://github.com/wgcisotto/config-server)
- [eureka-server](https://github.com/wgcisotto/eureka-server)
- [admin-server](https://github.com/wgcisotto/admin-server)
- [sentence-server](https://github.com/wgcisotto/sentence-service)
- [word-server](https://github.com/wgcisotto/word-server)
- [config-repo](https://github.com/wgcisotto/config-repo)

## Functional services

Sentence Generator was decomposed into one core microservices. All of them are independently deployable applications, organized around certain business domains.

#### Word service

return random words depending the profile actived 

available profiles: article, adjective, noun, subject, verb

#### Sentence service

Generates a full sentence by calling 5 microservices 

### Config service
[Spring Cloud Config](http://cloud.spring.io/spring-cloud-config/spring-cloud-config.html) is horizontally scalable centralized configuration service for distributed systems. It uses a pluggable repository layer that currently supports local storage, Git, and Subversion. 

In this project, I use 5 profiles article, adjective, noun, subject, verb each one has a list of word. You can see `shared` directory in [Config service resources](https://github.com/wgcisotto/config-repo).

### Service discovery

Another commonly known architecture pattern is Service discovery. It allows automatic detection of network locations for service instances, which could have dynamically assigned addresses because of auto-scaling, failures and upgrades.

The key part of Service discovery is Registry. I use Netflix Eureka in this project. Eureka is a good example of the client-side discovery pattern, when client is responsible for determining locations of available service instances (using Registry server) and load balancing requests across them.

With Spring Boot, you can easily build Eureka Registry with `spring-cloud-starter-eureka-server` dependency, `@EnableEurekaServer` annotation and simple configuration properties.

Client support enabled with `@EnableDiscoveryClient` annotation an `bootstrap.yml` with application name:
``` yml
spring:
  application:
    name: word-server
```

Now, on application startup, it will register with Eureka Server and provide meta-data, such as host and port, health indicator URL, home page etc. Eureka receives heartbeat messages from each instance belonging to a service. If the heartbeat fails over a configurable timetable, the instance will be removed from the registry.

Also, Eureka provides a simple interface, where you can track running services and a number of available instances: `http://localhost:8761`

### Load balancer, Circuit breaker and Http client

Netflix OSS provides another great set of tools. 

#### Ribbon
Ribbon is a client side load balancer which gives you a lot of control over the behaviour of HTTP and TCP clients. Compared to a traditional load balancer, there is no need in additional hop for every over-the-wire invocation - you can contact desired service directly.

Out of the box, it natively integrates with Spring Cloud and Service Discovery. [Eureka Client](https://github.com/wgcisotto/eureka-server) provides a dynamic list of available servers so Ribbon could balance between them.

#### Hystrix
Hystrix is the implementation of [Circuit Breaker pattern](http://martinfowler.com/bliki/CircuitBreaker.html), which gives a control over latency and failure from dependencies accessed over the network. The main idea is to stop cascading failures in a distributed environment with a large number of microservices. That helps to fail fast and recover as soon as possible - important aspects of fault-tolerant systems that self-heal.

Besides circuit breaker control, with Hystrix you can add a fallback method that will be called to obtain a default value in case the main command fails.

//Moreover, Hystrix generates metrics on execution outcomes and latency for each command, that we can use to [monitor system //behavior](https://github.com/sqshq/PiggyMetrics#monitor-dashboard).

#### Feign
Feign is a declarative Http client, which seamlessly integrates with Ribbon and Hystrix. Actually, with one `spring-cloud-starter-feign` dependency and `@EnableFeignClients` annotation you have a full set of Load balancer, Circuit breaker and Http client with sensible ready-to-go default configuration.

Here is an example from Account Service:

``` java
@FeignClient("VERB")
public interface VerbClient {

    @GetMapping("/")
    Word getWord();

}
```

- Everything you need is just an interface
- You can share `@RequestMapping` part between Spring MVC controller and Feign methods
- Above example specifies just desired service id - `word-server`, thanks to autodiscovery through Eureka (but obviously you can access any resource with a specific url)

### Monitor dashboard
SpringBoot Admin is a dashboard

### Log analysis
todo

## How to run all the things?
Keep in mind, that you are going to start 8 Spring Boot applications. Make sure you have `4 Gb` RAM available on your machine.

#### Before you start
- Install Docker and Docker Compose.

#### Production mode
In this mode, all latest images will be pulled from Docker Hub.
Just copy `docker-compose.yml` and hit `docker-compose up`

#### Important endpoints


## Contributions are welcome!

Feel free to suggest and implement improvements.
