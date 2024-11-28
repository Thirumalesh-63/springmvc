package Firstmvc.Mvcex.person.bean;

public class student {

    private int id;

    private String name;

    private String age;

    private String dept;


    private Long phno;
    public student() {
    }

    public student(int id, String name,String age,long phno,String dept) {
        this.id = id;
        this.name = name;
        this.age=age;
        this.phno=phno;
        this.dept=dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }
}
