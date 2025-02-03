package Firstmvc.Mvcex.person.bean;

public class Person {
    int id3;
    String name3;
    int sal3;
    String company3;

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
    }

    public Person( int id,String name, int sal, String company) {
        this.name3 = name;
        this.id3 = id;
        this.sal3 = sal;
        this.company3 = company;
    }
}
