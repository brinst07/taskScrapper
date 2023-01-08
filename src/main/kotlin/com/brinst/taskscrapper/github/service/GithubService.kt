package com.brinst.taskscrapper.github.service

import com.brinst.taskscrapper.github.repository.GithubRepository
import org.springframework.stereotype.Service

@Service
class GithubService(
    val githubRepository: GithubRepository
) {
    fun getAllRepoList(token: String) : List<String>{
        return githubRepository.getAllRepoList(token).keys.stream().toList()
    }
}