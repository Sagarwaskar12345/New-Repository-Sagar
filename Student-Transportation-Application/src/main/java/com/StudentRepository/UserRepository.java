package com.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Studententity.UserDtls;

public interface UserRepository extends JpaRepository <UserDtls ,Integer>
{
	
}