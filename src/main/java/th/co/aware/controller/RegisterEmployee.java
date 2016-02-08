package th.co.aware.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import th.co.aware.bo.EmployeeBO;
import th.co.aware.model.Employee;

@ManagedBean(name="registerEmployee")
@SessionScoped
public class RegisterEmployee implements Serializable {
       private static final long serialVersionUID = 1L;
       @ManagedProperty(value = "#{EmployeeBOImpl}")
       private EmployeeBO employeeImpl;
       
       public EmployeeBO getEmployeeImpl() {
              return employeeImpl;
       }

       public void setEmployeeImpl(EmployeeBO employeeImpl) {
              this.employeeImpl = employeeImpl;
       }

       private List<Employee> employees;
       
       private Employee employee = new Employee();

       @PostConstruct
       public void init() {
              this.setEmployees(employeeImpl.findAll());
       }

       public List<Employee> getEmployees() {
              return employees;
       }

       public void setEmployees(List<Employee> employees) {
              this.employees = employees;
       }

       public Employee getEmployee() {
              return employee;
       }

       public void setEmployee(Employee employee) {
              employee = (Employee) employeeImpl.findAll();
              this.employee = employee;
       }

       public String register() {
              employeeImpl.register(employee);
              FacesContext.getCurrentInstance().addMessage(null,
                           new FacesMessage("The Employee " + this.employee.getEmpName() + " Is Registered Successfully"));
              init();
              return "";
       }
}

