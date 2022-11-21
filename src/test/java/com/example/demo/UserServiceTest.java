package com.example.demo;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.ArrayList;
import static org.junit.Test;
import static org.junit.A
        
import static org.mockito.Mockito.mock;

public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setupService(){
        userRepository = mock(UserRepository.class);
    }

    @Test
    void saveUser(){
        Object person = new String[]{"test@test.com", "test", "6"};


    }
}
