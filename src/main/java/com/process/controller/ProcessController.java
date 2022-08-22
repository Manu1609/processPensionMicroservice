package com.process.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.process.client.PensionerDetailMicroserviceClient;
import com.process.entity.PensionerDetail;
import com.process.entity.ProcessPension;

@RestController
@RequestMapping("/process")
public class ProcessController {

	@Autowired
	private PensionerDetailMicroserviceClient pensionerDetailMicroserviceClient;

	
	@RequestMapping(value = "/find/{aadhar}", method = RequestMethod.GET)
	public ResponseEntity<ProcessPension> findPensionerByAadhar(@PathVariable("aadhar") String aadhar) {
		PensionerDetail pensionerDetail = pensionerDetailMicroserviceClient.findPensionerByAadhar(aadhar);
		Double allowances = pensionerDetail.getAllowances();
		Double salary = pensionerDetail.getSalary();
		Integer publicBank = 500;
		Integer privateBank = 550;
		double salaryEarned;
		ProcessPension pensionDetail = new ProcessPension();

		if (pensionerDetail.getPensionType().matches("self")) {
			salaryEarned = (salary * 0.8) + allowances;
			pensionDetail.setPensionAmount(salaryEarned);
		} else if (pensionerDetail.getPensionType().matches("family")) {
			salaryEarned = (salary * 0.5) + allowances;
			pensionDetail.setPensionAmount(salaryEarned);
		}
		if (pensionerDetail.getBankType().matches("public")) {
			pensionDetail.setBankServiceCharge(publicBank);
			System.out.println(pensionDetail.getBankServiceCharge());
		} else if (pensionerDetail.getBankType().matches("private")) {
			pensionDetail.setBankServiceCharge(privateBank);
			System.out.println(pensionDetail.getBankServiceCharge());
		}
		
		return new ResponseEntity<ProcessPension>(pensionDetail, HttpStatus.OK);
	}
}
