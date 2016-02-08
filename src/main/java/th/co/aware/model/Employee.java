package th.co.aware.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;


/**
 * The persistent class for the employee_jsf database table.
 * 
 */
@Entity
@Table(name="employee_jsf")
//@NamedQuery(name="EmployeeJsf.findAll", query="SELECT e FROM EmployeeJsf e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="EMP_ID")
	private int empId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EMP_HIRE_DATE")
	private Date empHireDate;

	@Column(name="EMP_NAME")
	private String empName;

	@Column(name="EMP_SALARY")
	private BigDecimal empSalary;

	public Employee() {
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getEmpHireDate() {
		return this.empHireDate;
	}

	public void setEmpHireDate(Date empHireDate) {
		this.empHireDate = empHireDate;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getEmpSalary() {
		return this.empSalary;
	}

	public void setEmpSalary(BigDecimal empSalary) {
		this.empSalary = empSalary;
	}

}