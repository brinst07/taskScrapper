package com.brinst.taskscrapper.github

import org.kohsuke.github.GHRepository
import org.kohsuke.github.GitHub
import org.kohsuke.github.GitHubBuilder
import org.kohsuke.github.HttpException
import org.springframework.stereotype.Service

@Service
class Service(
    val repository: Repository
) {
    fun getAllRepoList(token: String) : List<String>{
        return repository.getAllRepoList(token).keys.stream().toList()
    }
}