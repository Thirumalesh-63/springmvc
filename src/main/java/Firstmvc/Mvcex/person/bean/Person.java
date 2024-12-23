package Firstmvc.Mvcex.person.bean;

public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id1 + ", name=" + name1 + ", sal=" + sal1 + ", company=" + company1 + "]";
	}
	int id1;
	String name1;
	int sal1;
	String company1;
	public int getId() {
		return id1;
	}
	public void setId(int id) {
		this.id1 = id;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	public int getSal() {
		return sal1;
	}
	public void setSal(int sal) {
		this.sal1 = sal;
	}
	public String getCompany() {
		return company1;
	}
	public void setCompany(String company) {
		this.company1 = company;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int sal, String company) {
		super();
		this.id1 = id;
		this.name1 = name;
		this.sal1 = sal;
		this.company1 = company;
	}
	

}
