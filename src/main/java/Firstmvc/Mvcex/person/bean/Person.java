package Firstmvc.Mvcex.person.bean;

public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id4 + ", name=" + name4 + ", sal=" + sal4 + ", company=" + company4 + "]";
	}
	int id4;
	String name4;
	int sal4;
	String company4;
	public int getId() {
		return id4;
	}
	public void setId(int id) {
		this.id4 = id;
	}
	public String getName() {
		return name4;
	}
	public void setName(String name) {
		this.name4 = name;
	}
	public int getSal() {
		return sal4;
	}
	public void setSal(int sal) {
		this.sal4 = sal;
	}
	public String getCompany() {
		return company4;
	}
	public void setCompany(String company) {
		this.company4 = company;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int sal, String company) {
		super();
		this.id4 = id;
		this.name4 = name;
		this.sal4 = sal;
		this.company4 = company;
	}
	

}
