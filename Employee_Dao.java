package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Employee_Dao {
	@Autowired
	Employee_Repository emprepo;
	public String SaveDetails(Employee e) {
		emprepo.save(e);
		return"Successfully succced";
		
	}
	public Employee getDetails(int id) {
		return emprepo.findById(id).get();
	}
	public String updateInformation(Employee e) {
		emprepo.save(e).getId();
		return "data updated";
	}
	public String deleteInformation(Integer id) {
		emprepo.deleteById(id);
		return "data has been deleted";
	}
	public List<Employee> getBySal(int sal1,int sal2) {
	return emprepo.getBySal(sal1, sal2);
	

}
}