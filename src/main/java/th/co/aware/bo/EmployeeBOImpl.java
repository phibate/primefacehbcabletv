package th.co.aware.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.aware.dao.EmployeeDAO;
import th.co.aware.model.Employee;


@Service("EmployeeBOImpl")
@Transactional(readOnly = true)
public class EmployeeBOImpl implements EmployeeBO {
	
	@Autowired
	private EmployeeDAO emplDAO;
	
	
	@Transactional(readOnly = false)
	public void register(Employee emp) {
		emplDAO.register(emp);

	}
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return emplDAO.findAll();
	}

}
