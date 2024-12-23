package Firstmvc.Mvcex.person.bean;

public class Person {
	@Override
	public String toString() {
		return "Person [id=" + id3 + ", name=" + name3 + ", sal=" + sal3 + ", company=" + company3 + "]";
	}
	int id1;
	String name1;
	int sal1;
	String company1;
	public int getId() {
		return id3;
	}
	public void setId(int id) {
		this.id3 = id;
	}
	public String getName() {
		return name3;
	}
	public void setName(String name) {
		this.name3 = name;
	}
	public int getSal() {
		return sal3;
	}
	public void setSal(int sal) {
		this.sal3 = sal;
	}
	public String getCompany() {
		return company3;
	}
	public void setCompany(String company) {
		this.company3 = company;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int sal, String company) {
		super();
		this.id3 = id;
		this.name3 = name;
		this.sal3 = sal;
		this.company3 = company;
	}
	

}
