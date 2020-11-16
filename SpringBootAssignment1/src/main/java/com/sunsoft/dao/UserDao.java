package com.sunsoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.model.UserData;
import com.sunsoft.repository.StudentRepository;

@Service
public class UserDao {
	@Autowired
	StudentRepository studentRepository;

	public void insertData(UserData studentObj) {
		studentRepository.save(studentObj);
	}

	public void deleteRecord(int id) {
		studentRepository.deleteById(id);
	}

	public boolean SearchRecord(String name, String password)
	{
		List<UserData> userList = (List<UserData>) studentRepository.findAll();
		for(UserData u : userList) {
			if(u.getName().contentEquals(name) && u.getPassword().contentEquals(password))
			{
				return true;
			}
		}
		return false;
		
	}
	public List<UserData> displayAll() {
		List<UserData> studentList = (List<UserData>) studentRepository.findAll();
		return studentList;
	}
}
