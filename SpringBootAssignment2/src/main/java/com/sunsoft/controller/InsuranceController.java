package com.sunsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.dao.InsuranceDao;
//import com.sunsoft.dao.insuranceDao;
import com.sunsoft.model.InsuranceData;
//import com.sunsoft.model.InsuranceData;

@RestController
public class InsuranceController {
	@Autowired
	InsuranceDao insuranceDao;

	@RequestMapping("/insert")
	public String insertData() {
		InsuranceData insuranceObj = new InsuranceData();
		insuranceObj.setPolicyno(11);
		insuranceObj.setCustomername("Jaya Surya");
		insuranceObj.setValidity("01/01/2010-01/01/2015");
		insuranceObj.setPolicy("Car");
		
		InsuranceData insuranceObj2 = new InsuranceData();
		insuranceObj2.setPolicyno(12);
		insuranceObj2.setCustomername("Senthil");
		insuranceObj2.setValidity("01/01/2008-01/01/2013");
		insuranceObj2.setPolicy("Medical");
		
		InsuranceData insuranceObj3 = new InsuranceData();
		insuranceObj3.setPolicyno(11);
		insuranceObj3.setCustomername("Thaman");
		insuranceObj3.setValidity("01/01/2013-01/01/2018");
		insuranceObj3.setPolicy("House");

		insuranceDao.insertData(insuranceObj);
		insuranceDao.insertData(insuranceObj2);
		insuranceDao.insertData(insuranceObj3);
		return "Data inserted succesfully";

	}

	@RequestMapping("/delete/{policyno}")
	public String deleteData(@PathVariable("policyno") int policyno) {
		insuranceDao.deleteRecord(policyno);
		return "Record deleted successfully";
	}

	@RequestMapping("/displayAll")
	public List<InsuranceData> displayData() {
		List<InsuranceData> insuranceList = insuranceDao.displayAll();
		return insuranceList;
	}

}