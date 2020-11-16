package com.sunsoft.repository;

import org.springframework.data.repository.CrudRepository;

//import com.sunsoft.model.StudentData;
import com.sunsoft.model.UserData; 

public interface StudentRepository extends CrudRepository<UserData, Integer> {

}