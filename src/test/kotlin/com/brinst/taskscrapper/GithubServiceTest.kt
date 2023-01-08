package com.brinst.taskscrapper

import com.brinst.taskscrapper.github.Service
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.kohsuke.github.GitHubBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GithubServiceTest{
    @Autowired
    private lateinit var service : Service

    @Test
    fun getAllRepoListTest() {
        val allRepoList = service.getAllRepoList("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")
        assertThat(allRepoList).isNotEmpty
    }

}