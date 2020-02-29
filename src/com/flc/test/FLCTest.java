package com.flc.test;

import com.flc.entities.InstallationRequests;
import com.flc.entities.Staff;
import com.flc.helper.EntityManagerFactoryServiceRegistry;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class FLCTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        InstallationRequests installationRequests = null;
        Staff staff = null;

        InstallationRequests installationRequests1 = null;
        Staff staff1 = null;

        InstallationRequests installationRequests2 = null;
        Staff staff2 = null;

        EntityTransaction transaction = null;
        boolean flag = false;

        try {
            entityManagerFactory = EntityManagerFactoryServiceRegistry.getEntityManagerFactory();
            entityManager = entityManagerFactory.createEntityManager();
            installationRequests = new InstallationRequests();
            staff = new Staff();
            transaction = entityManager.getTransaction();
            transaction.begin();
            installationRequests = entityManager.find(InstallationRequests.class, "ITR0006");
            staff = entityManager.find(Staff.class, installationRequests.getStaff_number());
            installationRequests1 = entityManager.find(InstallationRequests.class, "ITR0006");
            entityManager.clear();
            staff1 = entityManager.find(Staff.class, installationRequests.getStaff_number());
            installationRequests2 = entityManager.find(InstallationRequests.class, "ITR0006");
            staff2 = entityManager.find(Staff.class, installationRequests.getStaff_number());
            System.out.println(staff);
            System.out.println(installationRequests);
            System.out.println(staff1);
            System.out.println(installationRequests1);
            System.out.println(staff2);
            System.out.println(installationRequests2);

            System.out.println("staff == staff ?: "+ (staff==staff));
            System.out.println("staff1 == staff ?: "+ (staff1==staff));
            System.out.println("staff2 == staff ?: "+ (staff2==staff));
            System.out.println("staff1 == staff2 ?: "+ (staff1.hashCode()==staff2.hashCode()));
            System.out.println("installationRequests == installationRequests ?: "+ (installationRequests==installationRequests));
            System.out.println("installationRequests1 == installationRequests ?: "+ (installationRequests1==installationRequests));
            System.out.println("installationRequests2 == installationRequests ?: "+ (installationRequests2==installationRequests));
            System.out.println("installationRequests1 == installationRequests2 ?: "+ (installationRequests1==installationRequests2));
            entityManager.clear();
            flag = true;
        } finally {
            if (transaction != null) {
                if (flag) {
                    transaction.commit();
                } else {
                    transaction.rollback();
                }
            }
            EntityManagerFactoryServiceRegistry.closeFactory();
        }
    }
}
