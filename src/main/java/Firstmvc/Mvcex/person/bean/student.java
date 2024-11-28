package Firstmvc.Mvcex.person.bean;

public class student {

    private int id;

    private String name;

    private String age;

    private String phno;

    public student() {
    }

    public student(int id, String name,String age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

     public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
