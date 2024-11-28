package Firstmvc.Mvcex.person.bean;

public class student {

    private int id;

    private String lname;

    private String age;

    private String dept;

    private double salary;
    private Long phno;

    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return lname;
    }

    public void setName(String lname) {
        this.lname = lname;
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
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public student(int id, String lname, String age, String dept, double salary, Long phno,String city) {
        this.id = id;
        this.lname = lname;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
        this.phno = phno;
        this.city=city;
    }

    public student() {
    }
}
