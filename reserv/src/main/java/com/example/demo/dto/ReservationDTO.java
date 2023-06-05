package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString


public class ReservationDTO {
	private Long id;
	private String memberEmail;
	private String memberPassword;
	private String memberName;
//	private String reservation_date;
//	private int reservation_time;
//	private String laundry_num;

}
