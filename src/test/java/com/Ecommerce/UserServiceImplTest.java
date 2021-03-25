package com.Ecommerce;

import com.Ecommerce.Model.User;
import com.Ecommerce.Repository.UserRepository;
import com.Ecommerce.Service.UserServiceImpl;
import com.Ecommerce.web.dto.UserRegistrationDto;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.util.AssertionErrors.assertNull;

@SpringBootTest
class UserServiceImplTest {

	@Mock
	UserRepository userRepository;

	@InjectMocks //
    UserServiceImpl userServiceImpl;

    @Test
    public void save() {
        UserRegistrationDto userRegistrationDto = new UserRegistrationDto();
        Mockito.when(userRepository.save(any())).thenReturn(null);

        //assertNull(userServiceImpl.save(userRegistrationDto));
    }
}
