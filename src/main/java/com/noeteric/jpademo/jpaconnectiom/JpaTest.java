package com.noeteric.jpademo.jpaconnectiom;

import java.util.List;

public class JpaTest {
    public static void main(String[] args) {
    List<Employee> projectList = JpaService.getEmployeesWithProjects();
    for(Employee project :projectList){
        System.out.println(project);

    }
    }
}
