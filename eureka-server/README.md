[![Build Status](https://travis-ci.com/wgcisotto/eureka-server.svg?branch=master)](https://travis-ci.com/wgcisotto/eureka-server)
[![codecov](https://codecov.io/gh/wgcisotto/eureka-server/branch/master/graph/badge.svg)](https://codecov.io/gh/wgcisotto/eureka-server)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/wgcisotto/eureka-server/blob/master/LICENSE)

## Eureka - Sentence Generator 

**Description**

Service discovery. It allows automatic detection of network locations for service instances, which could have dynamically assigned addresses because of auto-scaling, failures and upgrades.

The key part of Service discovery is Registry. I use Netflix Eureka in this project. Eureka is a good example of the client-side discovery pattern, when client is responsible for determining locations of available service instances (using Registry server) and load balancing requests across them. 


**Build**

``./mvnw clean install dockerfile:build`` 

**Run Docker**

``docker run wgcisotto/eureka-server`` 
 
**Testing**

``curl https://localhost:8010/``
 
**Push to DockerHub**

``docker login``

``docker push wgcisotto/eureka-server:latest``
