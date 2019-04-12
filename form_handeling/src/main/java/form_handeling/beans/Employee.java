package form_handeling.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
      @Id
      @Column(name="employee_ID")
      private int empID;
      
      @Column(name="")
      private String employeeName;
      
      @Column(name="employeeSalary")
      private double employeeSalary;
      
      @Column(name="employeeAddress")
      private String employeeAddress;
      
      @Column(name="workingCompany")
      private String companyName;
      
      @Column(name="bloodGroup")
      private String empBloodgrp;
      
      @Column(name="password")
      private String password;
      
      @Column(name="confirmPassword")
      private String confPassword;
      public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empID, String employeeName, double employeeSalary, String employeeAddress, String companyName,
			String empBloodgrp,String password,String confPassword) {
		super();
		this.empID = empID;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
		this.companyName = companyName;
		this.empBloodgrp = empBloodgrp;
		this.password=password;
		this.confPassword=confPassword;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmpBloodgrp() {
		return empBloodgrp;
	}

	public void setEmpBloodgrp(String empBloodgrp) {
		this.empBloodgrp = empBloodgrp;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	public String getConfPassword() {
		return confPassword;
	}
      
}
