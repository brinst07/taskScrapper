package com.brinst.taskscrapper.user.service

import com.brinst.taskscrapper.user.dto.JoinMemberDTO
import com.brinst.taskscrapper.user.dto.LoginMemberDTO
import com.brinst.taskscrapper.user.dto.ResponseMemberDTO
import com.brinst.taskscrapper.user.repository.UserRepository
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService (
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
){
    fun getUserList(): MutableList<ResponseMemberDTO> {
        return userRepository.findAll().stream().map { member -> member.convertDTO() }.toList()
    }

//    fun getUserByName(name : String) : ResponseMemberDTO {
////        return userRepository.findByName(name).convertDTO()
//    }

    fun joinUser(joinMemberDTO: JoinMemberDTO) : ResponseMemberDTO {
        return userRepository.save(joinMemberDTO.convertEntity()).convertDTO()
    }

    fun login(loginMemberDTO: LoginMemberDTO) : String {
        val member =
            userRepository.findByName(loginMemberDTO.userName) ?: throw UsernameNotFoundException("존재하지 않는 user입니다.")

        if(!passwordEncoder.matches(loginMemberDTO.pw, member.pw)) {

        }

        return member.name
    }
}