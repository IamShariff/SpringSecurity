package com.finlcok.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finlcok.demo.requestdto.AddUserDto;
import com.finlcok.demo.responsedto.AddUserResponseDto;
import com.finlcok.demo.service.FinlockService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final FinlockService finlockService;

	@PostMapping("/add")
	ResponseEntity<AddUserResponseDto> signUp(@RequestBody AddUserDto addUserDto) {
		System.out.println(addUserDto.getEmail());
		return ResponseEntity.ok(finlockService.addUser(addUserDto));
	}

	@GetMapping()
	public String hello() {
		return "Hello";
	}

	@GetMapping("/home")
	@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("Home service");
	}

	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public ResponseEntity<String> admin() {
		return ResponseEntity.ok("Admin service");
	}

}
