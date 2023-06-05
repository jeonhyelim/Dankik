package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString


public class HomeDTO {
	private String reservation_date;
	private String reservation_time;
	private String laundry_num;

}
