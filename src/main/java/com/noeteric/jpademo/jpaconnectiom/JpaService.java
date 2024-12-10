package com.noeteric.jpademo.jpaconnectiom;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class JpaService {

    public JpaService() {
    }

    public static List<Employee> getEmployeesWithProjects() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpademo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        List<Employee> employees = null;
        try {

            Query query = em.createQuery("SELECT e FROM Employee e JOIN FETCH e.project");
            employees = query.getResultList();

            for (Employee employee : employees) {
                System.out.println("Employee: " + employee.getName());
                if (employee.getProject() != null) {
                    System.out.println("    Project: " + employee.getProject().getPname());
                } else {
                    System.out.println("    No Project Assigned");
                }
            }

            em.getTransaction().commit();

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
        return employees;
    }
}
