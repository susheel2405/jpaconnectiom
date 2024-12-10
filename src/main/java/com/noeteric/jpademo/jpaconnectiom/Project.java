package com.noeteric.jpademo.jpaconnectiom;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "project",schema = "sys")
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;  // Project's primary key

  private String pname; // Project's name

  // Getters and Setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }
}