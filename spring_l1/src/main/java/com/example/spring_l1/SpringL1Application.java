package com.example.spring_l1;

import com.example.spring_l1.model.User;
import com.example.spring_l1.repo.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringL1Application {

//	@Autowired
//	static
//	userRepo user;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringL1Application.class, args);


		// Get the userRepo bean from the context
		UserRepo user = context.getBean(UserRepo.class);

		// Create and save a user
//		User u1 = new User();
//		u1.setAge(87);
//		u1.setName("Kushal");
//		User uv = user.save(u1);
//		System.out.println(uv);
//
//		User u2 = new User();
//		u2.setName("Sayak");
//		u2.setAge(22);

//		List<User> users= new ArrayList<>();
//		users.add(u1);
//		users.add(u2);
//		user.saveAll(users);

//		User ux = user.save(u2);
//		System.out.println(ux);

//		Optional<User> findUser = user.findById(1);
//		if(findUser.isPresent()){
//			User upUser = findUser.get();
//			upUser.setAge(24);
//
//			user.save(upUser);
//			System.out.println("updated");

//		Optional<User> deleteUser = user.findById(3);
//		if(deleteUser.isPresent()){
//			User ux = deleteUser.get();
//			user.delete(ux);
//
//			System.out.println(ux+" Deleted");
//
//		}
		//custom method

//		List<User> users = user.findByName("Kushal");
//		users.forEach(e->System.out.println(e));

		User u1 = user.findByPersonalName("Kushal");
		System.out.println(u1);

		System.out.println("_______________________________");

		List<User> users = user.findByAge(25);
		users.forEach(e->System.out.println(e));

		System.out.println("_______________________________");

		user.getUsers().forEach(e->System.out.println(e));
		}







}
