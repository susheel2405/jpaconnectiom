package com.noeteric.jpademo.jpaconnectiom.jappractise;


import jakarta.persistence.*;

@Entity
@Table(name = "Employee",schema = "sys")
public class EmployeeEntity {



    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dept")
    private String department;

    @Column(name = "salary")
    private double salary;


    @ManyToOne
    @JoinColumn(name = "pid",referencedColumnName = "id", nullable = false)
    private ProjectEntity project;

    // Getters and Setters
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    // toString method for debugging


    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}