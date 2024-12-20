package Firstmvc.Mvcex.person.bean;

public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sal=" + sal + ", company=" + company + "]";
	}
	int id2;
	String name;
	int sal;
	String company;
	public int getId() {
		return id2;
	}
	public void setId(int id2) {
		this.id2 = id2;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id2, String name, int sal, String company) {
		super();
		this.id2 = id2;
		this.name = name;
		this.sal = sal;
		this.company = company;
	}
	

}
