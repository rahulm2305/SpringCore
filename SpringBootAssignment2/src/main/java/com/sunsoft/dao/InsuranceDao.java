package com.sunsoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.model.InsuranceData;
import com.sunsoft.repository.InsuranceRepository;

@Service
public class InsuranceDao {
	@Autowired
	InsuranceRepository insuranceRepository;

	public void insertData(InsuranceData insuranceObj) {
		insuranceRepository.save(insuranceObj);
	}

	public void deleteRecord(int policyno) {
		insuranceRepository.deleteById(policyno);
	}

	public List<InsuranceData> displayAll() {
		List<InsuranceData> insuranceList = (List<InsuranceData>) insuranceRepository.findAll();
		return insuranceList;
	}
}