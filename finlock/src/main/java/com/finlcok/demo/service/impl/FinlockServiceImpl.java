package com.finlcok.demo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.finlcok.demo.exception.AlreadyExistException;
import com.finlcok.demo.model.User;
import com.finlcok.demo.repository.UserRepository;
import com.finlcok.demo.requestdto.AddUserDto;
import com.finlcok.demo.responsedto.AddUserResponseDto;
import com.finlcok.demo.service.FinlockService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FinlockServiceImpl implements FinlockService {

	private final UserRepository userRepository;
	private final ModelMapper mapper;

	@Override
	public AddUserResponseDto addUser(AddUserDto addUserDto) {
		userRepository.findByEmail(addUserDto.getEmail()).ifPresent(existingUser -> {
			throw new AlreadyExistException("email", "Email already exist");
		});
		User user = mapper.map(addUserDto, User.class);
		userRepository.save(user);
		return mapper.map(user, AddUserResponseDto.class);
	}

}
