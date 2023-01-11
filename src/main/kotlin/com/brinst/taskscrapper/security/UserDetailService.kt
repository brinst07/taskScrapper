package com.brinst.taskscrapper.security

import com.brinst.taskscrapper.user.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailService(private val userRepository: UserRepository) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        val member = userRepository.findByName(username) ?: throw UsernameNotFoundException("존재하지 않는 user입니다.")
        return UserDetailsImpl(member)
    }

}