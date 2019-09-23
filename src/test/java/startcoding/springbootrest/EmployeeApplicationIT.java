//package startcoding.springbootrest;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = EmployeeApplication.class)
//@AutoConfigureMockMvc
//@TestPropertySource(locations="classpath:application-test.properties")
//public class EmployeeApplicationIT {
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@Before
//	public void setUp() throws Exception {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void findAllEmployees() throws Exception {
//
//		MvcResult mvcResult = mockMvc
//				.perform(MockMvcRequestBuilders.get("/company/employees").accept(MediaType.APPLICATION_JSON))
//				.andReturn();
//
//		System.out.println(mvcResult.getResponse().getStatus());
//		Assert.assertTrue(200 == mvcResult.getResponse().getStatus());
//	}
//}
