package com.noeteric.jpademo.jpaconnectiom;

import java.util.List;
import java.util.Map;

public class JpaTest {
    public static void main(String[] args) {
        JpaService jpaPractice = new JpaService();
        Map<Integer, List<Employee>> projectEmployeeMap = jpaPractice.getAllocationEmployeesJpa();

        for (Map.Entry<Integer, List<Employee>> entry : projectEmployeeMap.entrySet()) {
            System.out.println("Project ID: " + entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.println("Employee Name: " + employee.getName());
       }


        }
    }
}
