[![Build Status](https://travis-ci.com/wgcisotto/config-server.svg?branch=master)](https://travis-ci.com/wgcisotto/config-server)
[![codecov](https://codecov.io/gh/wgcisotto/config-server/branch/master/graph/badge.svg)](https://codecov.io/gh/wgcisotto/config-server)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/wgcisotto/config-server/blob/master/LICENSE)

## Config Server - Sentence Generator 

**Description**

[Spring Cloud Config](http://cloud.spring.io/spring-cloud-config/spring-cloud-config.html) is horizontally scalable centralized configuration service for distributed systems. It uses a pluggable repository layer that currently supports local storage, Git, and Subversion. 


**Build**

`` $ mkdir target/dependency ``
  
`` $ (cd target/dependency; jar -xf ../*.jar) ``
 
`` $ ./mvnw dockerfile:build``

**Run Docker**

``docker run wgcisotto/config-server`` 
 
**Testing**

``curl https://localhost:8081/``
 
**Push to DockerHub**

``docker login``

``docker push wgcisotto/config-server:latest``
