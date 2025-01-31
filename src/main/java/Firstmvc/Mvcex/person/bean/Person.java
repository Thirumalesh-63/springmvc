package Firstmvc.Mvcex.person.bean;

public class Person {
    int id6;
    String name6;
    int sal6;
    String company6;

    public int getId() {
        return id6;
    }

    public void setId(int id) {
        this.id6 = id;
    }

    public String getName() {
        return name6;
    }

    public void setName(String name) {
        this.name6 = name;
    }

    public int getSal() {
        return sal6;
    }

    public void setSal(int sal) {
        this.sal6 = sal;
    }

    public String getCompany() {
        return company6;
    }

    public void setCompany(String company) {
        this.company6 = company;
    }

    public Person() {
    }

    public Person( int id,String name, int sal, String company) {
        this.name6 = name;
        this.id6 = id;
        this.sal6 = sal;
        this.company6 = company;
    }
}
