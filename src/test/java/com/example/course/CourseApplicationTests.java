package com.example.course;

import com.example.course.entitie.User;
import com.example.course.resource.UserResource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseApplicationTests {

	private UserResource userResource;

	@Test
	void contextLoads() {
	}

	@Test
	void testEqualsUser(){

		User u1 = new User(2L, "yuri" , "yuritakeo@gmail.com", "27988792730","123456");
		User u2 = new User(2L, "yuri2" , "yuritakeo@gmail.com", "27988792730","123456");
		System.out.println("O usuario está imprimindo assim: (u1.toString())" + u1.toString());
		System.out.println("O usuario está imprimindo assim: (u2.toString())" + u2.toString());
//		O usuario está imprimindo assim: com.example.course.entitie.User@20
//		O usuario está imprimindo assim: com.example.course.entitie.User@21

		//Observação sobre a referencia testada (User equals)
		//


		assertEquals(u1.toString(), u2.toString());

		//userResource.findAll();
	}

}
