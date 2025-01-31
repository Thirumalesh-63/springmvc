package Firstmvc.Mvcex.person.bean;

public class Person {
    int id2;
    String name2;
    int sal2;
    String company2;

    public int getId() {
        return id2;
    }

    public void setId(int id) {
        this.id2 = id;
    }

    public String getName() {
        return name2;
    }

    public void setName(String name) {
        this.name2 = name;
    }

    public int getSal() {
        return sal2;
    }

    public void setSal(int sal) {
        this.sal2 = sal;
    }

    public String getCompany() {
        return company2;
    }

    public void setCompany(String company) {
        this.company2 = company;
    }

    public Person() {
    }

    public Person( int id,String name, int sal, String company) {
        this.name2 = name;
        this.id2 = id;
        this.sal2 = sal;
        this.company2 = company;
    }
}
