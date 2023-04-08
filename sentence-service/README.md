[![Build Status](https://travis-ci.com/wgcisotto/sentence-service.svg?branch=master)](https://travis-ci.com/wgcisotto/sentence-service)
[![codecov](https://codecov.io/gh/wgcisotto/sentence-service/branch/master/graph/badge.svg)](https://codecov.io/gh/wgcisotto/sentence-service)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/wgcisotto/sentence-service/blob/master/LICENSE)

## Sentence Service :: Sentence Generator 

Method	| Path	| Description
------------- | ------------------------- | ---------------------------------------------- |
GET	| /sentence	| Build 5 sentences by calling other 5 services. Each service is responsible for a word.	


## Starting application

**Build:**

``./mvnw clean install dockerfile:build`` 

**Run Docker**

``docker run wgcisotto/sentence-server``

**Testing**

``curl https://localhost:8080/sentence``
 
**Push to DockerHub**

``docker login``

``docker push wgcisotto/sentence-server:latest``

