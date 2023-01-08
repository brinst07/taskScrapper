package com.brinst.taskscrapper

import com.brinst.taskscrapper.github.service.GithubService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GithubGithubServiceTest{
    @Autowired
    private lateinit var githubService : GithubService

//    @Test
//    fun getAllRepoListTest() {
//        val allRepoList = githubService.getAllRepoList()
//        assertThat(allRepoList).isNotEmpty
//    }

}