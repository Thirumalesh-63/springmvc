package Firstmvc.Mvcex.person.bean;

public class Person {
    int id;
    String name;
    int sal;
    String company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Person() {
    }

    public Person( int id,String name, int sal, String company) {
        this.name = name;
        this.id = id;
        this.sal = sal;
        this.company = company;
    }
}
