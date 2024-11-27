package Firstmvc.Mvcex.person.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Employee {
	@NotEmpty(message = "id is mandatory")
	String id;
	@NotEmpty(message = "name is required")
	String name;
	int sal;
	@NotEmpty(message = "Phone is required with 10 characters")
	 @Min(value = 10, message = "Minimum 10 charectors required")
	 @Max(value = 10, message = "Max 10 charectors required")
	String phno;
	
//	 @Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")  	
//	String email;
	public Employee(String id, String name, int sal, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.phno = phno;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}

}
