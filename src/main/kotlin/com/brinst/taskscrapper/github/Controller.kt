package com.brinst.taskscrapper.github

import com.brinst.taskscrapper.github.dto.User
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/github")
class Controller(
    private val service: Service
) {

    @GetMapping("/test")
    fun test(): ResponseEntity<String> {
        return ResponseEntity("test", HttpStatus.OK)
    }

    @PostMapping("/join")
    fun join(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity(null, HttpStatus.OK)
    }
}