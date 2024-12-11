package com.noeteric.jpademo.jpaconnectiom.jappractise;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee",schema = "sys")
public class EmployeeEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "dept")
    private String dept;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "state")
    private String state;

    @Column(name = "mid")
    private int mid;

    @Column(name = "pid")
    private int pid;

}
