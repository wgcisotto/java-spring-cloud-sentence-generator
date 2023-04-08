[![Build Status](https://travis-ci.com/wgcisotto/gateway-server.svg?branch=master)](https://travis-ci.com/wgcisotto/gateway-server)
[![codecov](https://codecov.io/gh/wgcisotto/gateway-server/branch/master/graph/badge.svg)](https://codecov.io/gh/wgcisotto/gateway-server)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/wgcisotto/gateway-server/blob/master/LICENSE)

## Gateway Server - Sentence Generator 

**Description**



**Build**
 
`` $ ./mvnw clean install dockerfile:build``

**Run Docker**

``docker run wgcisotto/gateway-server`` 
 
**Testing**

``curl https://localhost:8080/``
 
**Push to DockerHub**

``docker login``

``docker push wgcisotto/gateway-server:latest``
