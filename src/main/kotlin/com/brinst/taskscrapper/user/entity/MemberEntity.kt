package com.brinst.taskscrapper.user.entity

import com.brinst.taskscrapper.user.dto.ResponseMemberDTO
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class MemberEntity(
    name: String,
    pw: String,
    token: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var name: String = name
    var pw: String = pw
    var token: String = token

    fun convertDTO(): ResponseMemberDTO {
        return ResponseMemberDTO(name = name, token = token)
    }
}