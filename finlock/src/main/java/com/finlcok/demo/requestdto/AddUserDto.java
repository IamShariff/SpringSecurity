package com.finlcok.demo.requestdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddUserDto {
	
	private String name;
	private String email;
	private String role;
	private String password;

}
