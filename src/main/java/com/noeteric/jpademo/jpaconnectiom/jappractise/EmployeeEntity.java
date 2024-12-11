package com.noeteric.jpademo.jpaconnectiom.jappractise;


import jakarta.persistence.*;

@Entity
@Table(name = "employee",schema = "sys")
public class EmployeeEntity {


    public  EmployeeEntity(){

    }
    @Id
    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private String name;

    @Column(name = "dept")
    private  String dept;

    @Column(name = "salary")
    private  double salary;

    @ManyToOne
    @JoinColumn(columnDefinition = "pid",referencedColumnName = "id")
    private ProjectEntity projectEntity;

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

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", mid=" + mid +
                '}';
    }

    @Column(name = "mid")
    private  int mid;



}
