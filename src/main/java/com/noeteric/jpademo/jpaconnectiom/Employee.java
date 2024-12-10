package com.noeteric.jpademo.jpaconnectiom;

import jakarta.persistence.*;
import java.util.Set;

@Entity()
@Table(name = "employee",schema = "sys")
public class Employee {

    @Id

    private Long id;  // Employee's primary key

    private String name; // Employee's name

    @ManyToOne  // Many Employees can be assigned to one Project
    @JoinColumn(name = "project_id")  // The foreign key column that points to Project
    private Project project;  // Reference to the Project the employee is associated with

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
