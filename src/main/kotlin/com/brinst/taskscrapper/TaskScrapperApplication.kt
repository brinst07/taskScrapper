package com.brinst.taskscrapper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskScrapperApplication

fun main(args: Array<String>) {
	runApplication<TaskScrapperApplication>(*args)
}
