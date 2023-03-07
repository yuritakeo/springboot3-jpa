package com.example.course.config;

import com.example.course.entitie.Category;
import com.example.course.entitie.Order;
import com.example.course.entitie.User;
import com.example.course.entitie.enums.OrderStatus;
import com.example.course.repositories.CategoryRepository;
import com.example.course.repositories.OrderRepository;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner { //CommandLineRunner = somente para iniciar a configuração?
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Limpesa");
        Category cat2 = new Category(null, "Bebida");
        Category cat3 = new Category(null, "Rateio");

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));


        User u1 = new User(null, "Yuri Takeo Miyazaki", "yuritakeo@gmail.com", "27988792730", "123456");
        User u2 = new User(null, "Fulano", "fulano@gmail.com", "11984563227", "654321");


        Order o1 = new Order(null, Instant.parse("2023-02-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2023-03-21T05:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
        Order o3 = new Order(null, Instant.parse("2023-03-22T07:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
