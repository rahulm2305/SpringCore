package com.sunsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.sunsoft.dao.StudentDao;
import com.sunsoft.dao.UserDao;
//import com.sunsoft.model.StudentData;
import com.sunsoft.model.UserData;

@RestController()
public class StudentController {
//	@Autowired
//	StudentDao studentDao;
	
	@Autowired
	UserDao userdao;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestBody String body) {
		String name = body.split("&")[0].split("=")[1];
		String password = body.split("&")[1].split("=")[1];
		String res = "INVALID USER";
		
		if(userdao.SearchRecord(name, password)) {
			res = "VALID_USER";
		} 

		return res;//
	}
	
	@RequestMapping("/insert")
	public String insertSampleUsersData() {
		UserData user1 = new UserData();
		user1.setId(1);
		user1.setName("Rahul");
		user1.setPassword("password");
		
		UserData user2 = new UserData();
		user2.setId(2);
		user2.setName("Manne");
		user2.setPassword("password");
		
		userdao.insertData(user1);
		userdao.insertData(user2);

		return "Data inserted succesfully";

	}

	@RequestMapping("/displayAll")
	public List<UserData> displayUserData() {
		List<UserData> userList = userdao.displayAll();
		return userList;
	}
}