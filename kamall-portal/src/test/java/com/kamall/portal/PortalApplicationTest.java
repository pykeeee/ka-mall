package com.kamall.portal;

import com.kamall.portal.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest

public class PortalApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void test1() {
        boolean matches = passwordEncoder.matches("123123", "$2a$10$/glU6SRk4.jCzHJRIPS2zO5e0YnjPCkgOhabWXp2pvBljqmFMkwR.");
        if (matches) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
