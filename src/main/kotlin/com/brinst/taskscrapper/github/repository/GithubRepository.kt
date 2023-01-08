package com.brinst.taskscrapper.github.repository

import org.kohsuke.github.GHRepository
import org.kohsuke.github.GitHub
import org.kohsuke.github.GitHubBuilder
import org.springframework.stereotype.Repository

@Repository
class GithubRepository {
    fun connectToGithub(token: String): GitHub {
        return GitHubBuilder().withOAuthToken(token).build()
    }

    fun getAllRepoList(token: String) : Map<String, GHRepository>{
        val github = connectToGithub(token)
        val myself = github.myself
        return myself.allRepositories
    }
}