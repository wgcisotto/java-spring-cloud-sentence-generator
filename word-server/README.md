[![Build Status](https://travis-ci.com/wgcisotto/word-server.svg?branch=master)](https://travis-ci.com/wgcisotto/word-server)
[![codecov](https://codecov.io/gh/wgcisotto/word-server/branch/master/graph/badge.svg)](https://codecov.io/gh/wgcisotto/word-server)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/wgcisotto/word-server/blob/master/LICENSE)

## Word server :: Sentence Generator 

Method	| Path	| Description | Profiles
------------- | ------------------------- | ------------------------------- | --------------|
GET	| /	| get a random word defined by the ${profile} | article, adjective, noun, subject, verb 


## Starting application

**Build:**

``./mvnw clean install dockerfile:build`` 

**Run Docker**

``docker run -Dspring.profiles.active=${profile} wgcisotto/word-server``

**Testing**

``curl https://localhost:${port}/``
 
**Push to DockerHub**

``docker login``

``docker push wgcisotto/word-server:latest``

