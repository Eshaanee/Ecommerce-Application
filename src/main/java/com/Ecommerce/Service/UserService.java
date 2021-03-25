package com.Ecommerce.Service;

import com.Ecommerce.Model.User;
import com.Ecommerce.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
