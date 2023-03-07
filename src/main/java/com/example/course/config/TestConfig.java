package com.example.course.config;

import com.example.course.entitie.User;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { //CommandLineRunner = somente para iniciar a configuração?
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Yuri Takeo Miyazaki", "yuritakeo@gmail.com", "27988792730", "123456");
        User u2 = new User(null, "Fulano", "fulano@gmail.com", "11984563227", "654321");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
