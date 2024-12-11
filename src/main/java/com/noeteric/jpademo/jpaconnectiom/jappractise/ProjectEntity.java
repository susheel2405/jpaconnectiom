package com.noeteric.jpademo.jpaconnectiom.jappractise;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "project", schema = "sys")
@Data
public class ProjectEntity {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "pname")
    private String pname;

    @Column(name = "startdate")
    private Date startdate;


    @Column(name = "enddtae")
    private Date enddate;

}
