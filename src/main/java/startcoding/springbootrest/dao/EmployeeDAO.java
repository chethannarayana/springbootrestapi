package startcoding.springbootrest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import startcoding.springbootrest.repository.EmployeeRepository;
import startcoding.springbootrest.model.Employee;

@Service
public class EmployeeDAO {

	@Autowired
	EmployeeRepository employeeRepository;

	/** To save an Employeyee **/
	public Employee save(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	/** search all employee **/
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	/** To get an Employeyee **/
	
	public Employee findOne(Long empid) {
		
		Optional<Employee> optional = employeeRepository.findById(empid);
		return optional.get();
	}
	/** To delete an Employeyee **/
	
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
	

}
