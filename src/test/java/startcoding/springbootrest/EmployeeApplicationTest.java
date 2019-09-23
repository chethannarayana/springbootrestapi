//package startcoding.springbootrest;
//
//import java.util.Collections;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import startcoding.springbootrest.controller.EmployeeController;
//import startcoding.springbootrest.dao.EmployeeDAO;
//import startcoding.springbootrest.model.Employee;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = EmployeeController.class)
//@AutoConfigureMockMvc
//public class EmployeeApplicationTest {
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@MockBean
//	EmployeeDAO employeeDAO;
//
//	@Before
//	public void setUp() throws Exception {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void findAllEmployees() throws Exception {
//		List<Employee> employeeList = Collections.EMPTY_LIST;
//
//		Mockito.when(employeeDAO.findAll()).thenReturn(employeeList);
//
//		MvcResult mvcResult = mockMvc
//				.perform(MockMvcRequestBuilders.get("/company/employees").accept(MediaType.APPLICATION_JSON))
//				.andReturn();
//
//		System.out.println(mvcResult.getResponse());
//		Mockito.verify(employeeDAO).findAll();
//	}
//}
