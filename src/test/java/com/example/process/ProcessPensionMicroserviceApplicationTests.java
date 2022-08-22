package com.example.process;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import com.process.ProcessPensionMicroserviceApplication;

@SpringBootTest(classes = ProcessPensionMicroserviceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProcessPensionMicroserviceApplicationTests {

	@Test
	void contextLoads() {
		ProcessPensionMicroserviceApplication.main(new String[] {});
		assertNotNull(ProcessPensionMicroserviceApplication.class);
	}

}
