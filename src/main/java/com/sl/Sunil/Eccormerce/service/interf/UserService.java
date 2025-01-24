package com.sl.Sunil.Eccormerce.service.interf;

import com.sl.Sunil.Eccormerce.dto.LoginRequest;
import com.sl.Sunil.Eccormerce.dto.Response;
import com.sl.Sunil.Eccormerce.dto.UserDto;
import com.sl.Sunil.Eccormerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
