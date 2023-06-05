package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.ReservationDTO;

@Controller
public class ReservationController {
	
	//회원가입 페이지 출력 요청
	@GetMapping("/member/save")
	public String saveForm() {
		return "save";
		
	}
	
	//입력값 받아오
	@PostMapping("/member/save")
	public String save(@ModelAttribute ReservationDTO reservationDTO) {
		
		
		System.out.println("ReservationController.save");
		System.out.println("reservationDTO = " + reservationDTO);
		return "index";
	}

}
