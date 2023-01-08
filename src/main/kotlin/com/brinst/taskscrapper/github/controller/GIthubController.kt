package com.brinst.taskscrapper.github.controller

import com.brinst.taskscrapper.github.service.GithubService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/github")
class GIthubController(
    private val githubService: GithubService
) {

    @GetMapping("/test")
    fun test(): ResponseEntity<String> {
        return ResponseEntity("test", HttpStatus.OK)
    }
}