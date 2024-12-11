package com.noeteric.jpademo.jpaconnectiom.jpademo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JpaService {

@PersistenceUnit(name = "jpademo")
    private static EntityManagerFactory entityManagerFactory;

    public Map<Integer, List<Employee>> getAllocationEmployeesJpa() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpademo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Map<Integer, List<Employee>> projectEmployeeMap = new HashMap<>();

        try {
            entityManager.getTransaction().begin();
            String sql = "SELECT p.id as projectId, e.id as employeeId, e.name as employeeName " +
                    "FROM sys.project p CROSS JOIN sys.employee e WHERE p.id = e.pid";

            Query query = entityManager.createNativeQuery(sql);

            List<Object[]> resultList = query.getResultList();

            for (Object[] result : resultList) {
                Integer projectId = (Integer) result[0];
                Integer employeeId = (Integer) result[1];
                String employeeName = (String) result[2];

                if (!projectEmployeeMap.containsKey(projectId)) {
                    projectEmployeeMap.put(projectId, new ArrayList<>());
                }

                Employee employee = new Employee();
                employee.setId(employeeId);
                employee.setName(employeeName);
                projectEmployeeMap.get(projectId).add(employee);
            }

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

        }

        return projectEmployeeMap;
    }
}

