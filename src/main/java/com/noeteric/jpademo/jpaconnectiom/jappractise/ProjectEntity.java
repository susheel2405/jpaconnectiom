package com.noeteric.jpademo.jpaconnectiom.jappractise;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Entity
@Table(name = "project", schema = "sys")
@Data

public class ProjectEntity {



        @Id
        @Column(name = "id", nullable = false)
        private int id;

        @Column(name = "pname", nullable = false)
        private String name;

        @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<EmployeeEntity> employees;

        @Column(name = "startdate", nullable = false)
        private Date startDate;

        @Column(name = "enddate", nullable = false)
        private Date endDate;

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

        public List<EmployeeEntity> getEmployees() {
            return employees;
        }

        public void setEmployees(List<EmployeeEntity> employees) {
            this.employees = employees;
        }

        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getEndDate() {
            return endDate;
        }

        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }


    @Override
    public String toString() {
        return "ProjectEntity{" +
                "employees=" + employees +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

