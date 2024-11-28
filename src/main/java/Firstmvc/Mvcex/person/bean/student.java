package Firstmvc.Mvcex.person.bean;

public class student {

    private int id;

    private String name;

    private int age;

    public student() {
    }

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

     public int getAge() {
        return age;
    }

     public int setAge(int age) {
        this.age=age;
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
}
