package com.hoon512.playground.cloudconfigtestconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CloudConfigTestConfigServerApplication

fun main(args: Array<String>) {
    runApplication<CloudConfigTestConfigServerApplication>(*args)
}
