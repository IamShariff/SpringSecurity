package com.finlcok.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	@Id
	private String userId;
	private String name;
	private String email;
	private String role;
	private String password;

}
