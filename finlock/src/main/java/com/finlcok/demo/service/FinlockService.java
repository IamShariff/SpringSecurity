package com.finlcok.demo.service;

import com.finlcok.demo.requestdto.AddUserDto;
import com.finlcok.demo.responsedto.AddUserResponseDto;

public interface FinlockService {

	AddUserResponseDto addUser(AddUserDto addUserDto);

}
