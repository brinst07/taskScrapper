package com.brinst.taskscrapper.user.repository

import com.brinst.taskscrapper.user.entity.MemberEntity
import org.springframework.data.domain.Example
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.FluentQuery
import org.springframework.stereotype.Repository
import java.util.function.Function

@Repository
interface UserRepository : JpaRepository<MemberEntity, Long> {
    fun findByName(name: String) : MemberEntity
}