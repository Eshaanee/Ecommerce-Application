package com.Ecommerce.Service;

import com.Ecommerce.Model.Role;
import com.Ecommerce.Model.User;
import com.Ecommerce.Repository.UserRepository;
import com.Ecommerce.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {  //we didnt make userserviceImpl obj
        this.userRepository=userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(),Arrays.asList(new Role("USER_ROLE")));
        return userRepository.save(user);
    }
}
