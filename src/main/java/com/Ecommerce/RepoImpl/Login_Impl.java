//package com.Ecommerce.RepoImpl;
//
//import com.Ecommerce.Repository.LoginRepository;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.Query;
//
//
//@Configuration
//public class Login_Impl implements LoginRepository {
//
//	@Override
//	@Query( value = "SELECT * FROM login WHERE login.username = akul",
//			  nativeQuery = true)
//	public Login findByUsername(String username) {
//
//		return findByUsername(username);
//	}
//
//	@Query(value = "select username, password from login where login.username= akul")
//	public boolean check(String username, String password) {
//		System.out.println(username);
//		System.out.println(password);
//		Login user = findByUsername(username);
//		if(user.getUsername().equals(username) && user.getPassword().equals(password))return true;
//		return false;
//	}
//
//}
