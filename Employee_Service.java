package com.example.demo;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Employee_Service {
	@Autowired
	Employee_Dao empdao;
	public String SaveDetails(Employee e) {
		return empdao.SaveDetails(e);
	}
	public Employee getDetails(int id) {
		return empdao.getDetails(id);
	}
	
	public String deleteInformation(int id) {
		return empdao.deleteInformation(id);
	}
	public List<Employee> getBySal(int sal1,int sal2) {
		return empdao.getBySal(sal1,sal2);
	}

}