package Firstmvc.Mvcex.person.bean;

public class Person {
    int id7;
    String name7;
    int sal7;
    String company7;

    public int getId() {
        return id7;
    }

    public void setId(int id) {
        this.id7 = id;
    }

    public String getName() {
        return name7;
    }

    public void setName(String name) {
        this.name7 = name;
    }

    public int getSal() {
        return sal7;
    }

    public void setSal(int sal) {
        this.sal7 = sal;
    }

    public String getCompany() {
        return company7;
    }

    public void setCompany(String company) {
        this.company7 = company;
    }

    public Person() {
    }

    public Person( int id,String name, int sal, String company) {
        this.name7 = name;
        this.id7 = id;
        this.sal7 = sal;
        this.company7 = company;
    }
}
