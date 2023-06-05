

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.HomeDTO;
import com.example.demo.dto.ReservationDTO;

@Controller
public class HomeController {
	
   //기본페이지 요청 메소드
   @GetMapping("/home")
   public String home() {
      return "home"; // index라는 html 파일을 띄우겠다/ templates 폴더의 index.html을 찾아감
   }   
   

 	//입력값 받아오
 	@PostMapping("/home")
 	public String save(@ModelAttribute HomeDTO homeDTO ) {
 		
 		
 		System.out.println("HomeController.save");
 		System.out.println("homeDTO = " + homeDTO);
 		return "index"; //index
 		
 		
 	}


   

}