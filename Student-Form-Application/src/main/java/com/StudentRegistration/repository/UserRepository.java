package com.StudentRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentRegistration.entity.UserDtls;

public interface UserRepository extends JpaRepository <UserDtls,Integer>
{
}
