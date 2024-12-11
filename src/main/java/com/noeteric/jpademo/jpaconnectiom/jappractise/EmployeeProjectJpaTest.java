package com.noeteric.jpademo.jpaconnectiom.jappractise;

import java.util.List;

public class EmployeeProjectJpaTest {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<ProjectEntity> projectList =  employeeService.projectAlloctionEmployees();
        for(int i =0 ; i<projectList.size(); i++ ){
            System.out.println(" Project  " + projectList.get(i));
            projectList.get(i).getEmployeeEntityList().forEach(emp -> {
                System.out.println("  emp " + emp);
            } );


        }
        System.out.println(projectList);
    }
}
