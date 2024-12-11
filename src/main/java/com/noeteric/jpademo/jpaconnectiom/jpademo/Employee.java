package com.noeteric.jpademo.jpaconnectiom.jpademo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "employee", schema = "sys")
@Data
public class Employee{

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dept", nullable = false)
    private String dept;

    @Column(name = "salary", nullable = false)
    private double salary;

    @ManyToOne
    @JoinColumn(name = "pid",referencedColumnName = "id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "mid", referencedColumnName = "id")
    private Employee manager;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employeeList;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", project=" + project +
                ", manager=" + manager +
                ", employeeList=" + employeeList +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

