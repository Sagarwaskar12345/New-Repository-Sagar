

package com.Studentcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentRepository.UserRepository;
import com.Studententity.UserDtls;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController
{
	@Autowired
	private  UserRepository repo;
	
 @GetMapping("/transport")
 public String home()
 {
	 return "index";
 }
 
 @PostMapping("*/transport")
 public String register(@ModelAttribute UserDtls u ,HttpSession session)
 {
	 System.out.println(u);
	 
	 repo.save(u);
	 session.setAttribute("Massage","User Register Successfully...");
	 
	 return "redirect:/";
 }
}
