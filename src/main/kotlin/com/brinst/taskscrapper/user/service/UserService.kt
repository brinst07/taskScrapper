package com.brinst.taskscrapper.user.service

import com.brinst.taskscrapper.user.dto.JoinMemberDTO
import com.brinst.taskscrapper.user.dto.ResponseMemberDTO
import com.brinst.taskscrapper.user.entity.MemberEntity
import com.brinst.taskscrapper.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (
    private val userRepository: UserRepository
){
    fun getUserList(): MutableList<ResponseMemberDTO> {
        return userRepository.findAll().stream().map { member -> member.convertDTO() }.toList()
    }

    fun getUserByName(name : String) : ResponseMemberDTO {
        return userRepository.findByName(name).convertDTO()
    }

    fun joinUser(joinMemberDTO: JoinMemberDTO) : ResponseMemberDTO {
        return userRepository.save(joinMemberDTO.convertEntity()).convertDTO()
    }
}