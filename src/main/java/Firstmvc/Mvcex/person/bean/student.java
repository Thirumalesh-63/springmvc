package Firstmvc.Mvcex.person.bean;

public class student {

    private int id;

    private String name;

    private String age;

    private String dept;

    private double salary;

    private Long phno;

    private String village;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

    public String getCity() {
        return village;
    }

    public void setCity(String village) {
        this.village = village;
    }

    public student(int id, String name, String age, String dept, double salary, Long phno,String village) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
        this.phno = phno;
        this.village=village;
    }

    public student() {
    }
}
