[![Build Status](https://travis-ci.com/wgcisotto/admin-server.svg?branch=master)](https://travis-ci.com/wgcisotto/admin-server)
[![codecov](https://codecov.io/gh/wgcisotto/admin-server/branch/master/graph/badge.svg)](https://codecov.io/gh/wgcisotto/admin-server)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/wgcisotto/admin-server/blob/master/LICENSE)

## Admin Server - Sentence Generator 

**Description**

[Spring Boot Admin](https://codecentric.github.io/spring-boot-admin/current/) is a web application, used for managing and monitoring Spring Boot applications. Each application is considered as a client and registers to the admin server. Behind the scenes, the magic is given by the Spring Boot Actuator endpoints.

In this article, we're going to describe steps for configuring a Spring Boot Admin server and how an application becomes a client.

**Build**

``./mvnw clean install dockerfile:build`` 

**Run Docker**

``docker run wgcisotto/admin-server`` 
 
**Testing**

``curl https://localhost:8020/``
 
**Push to DockerHub**

``docker login``

``docker push wgcisotto/admin-server:latest``

