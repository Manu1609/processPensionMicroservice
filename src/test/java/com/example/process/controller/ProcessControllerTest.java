package com.example.process.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.process.client.PensionerDetailMicroserviceClient;
import com.process.controller.ProcessController;
import com.process.entity.PensionerDetail;
import com.process.entity.ProcessPension;
import com.process.util.DateUtil;

@SpringBootTest
public class ProcessControllerTest {

	@MockBean
	private PensionerDetailMicroserviceClient pensionerDetailMicroserviceClient;
	
	@MockBean
	private ProcessController processController;
	
	@MockBean
	private MockMvc mockMvc;
	
//	@Test
//    void testCheckDetailsForIncorrectPensionerInputForFamily() throws ParseException {
//		PensionerDetail pensionerDetail = new PensionerDetail(123456789,"Manoj",DateUtil.parseDate("16-09-1998"),
//			"ABCD1234",Double.parseDouble("270000"),Double.parseDouble("10000"),"self","ICICI",Long.parseLong("12345678"),"private");
//       
//		ProcessPension processPension = new ProcessPension(Double.parseDouble("10000"),1234);
//
//       assertFalse(ProcessController.findPensionerByAadhar(aadhar, processPension));	
//}
	
//	@Test
//	void testFindPensionerFromController() throws Exception {
//		
//		final String aadhar = "123456789032";
//		PensionerDetail pensionerDetail = new PensionerDetail(aadhar,"Yuvaraj",DateUtil.parseDate("16-04-1999"),
//			"TYUOI09874",Double.parseDouble("70000"),Double.parseDouble("12002"),"self","Statebank",Long.parseLong("12345697"),"public");
//		
//		ProcessPension processPension = new ProcessPension(Double.parseDouble("10000"),1234);
//		
//		when(processController.findPensionerByAadhar(aadhar).thenReturn(pensionerDetail);
//		mockMvc.perform(get("/find/{aadhar}",aadhar)
//				.accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(jsonPath("$.name", Matchers.equalTo("Yuvaraj")))
//				.andExpect(jsonPath("$.accountNumber", Matchers.equalTo("12345697")));
//	}
}
