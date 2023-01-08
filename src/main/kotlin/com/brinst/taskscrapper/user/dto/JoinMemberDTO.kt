package com.brinst.taskscrapper.user.dto

import com.brinst.taskscrapper.user.entity.MemberEntity

class JoinMemberDTO(
    var userName: String,
    var pw: String,
    var token: String
) {
    fun convertEntity(): MemberEntity {
        return MemberEntity(this.userName, this.pw, this.token)
    }
}