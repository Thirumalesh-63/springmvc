package Firstmvc.Mvcex.person.bean;

public class student {

    private int id;

    private String name;

    private String age;

    private String dept;

    private double salary;
    private Long phno;
    public student() {
    }

    public student(int id, String name,String age,long phno,String dept,Double salary) {
        this.id = id;
        this.name = name;
        this.age=age;
        this.phno=phno;
        this.dept=dept;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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
