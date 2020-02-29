package com.flc.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryServiceRegistry {
    static EntityManagerFactory entityManagerFactory = null;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("pu1");
        } catch (Throwable t) {
            t.printStackTrace();
            throw t;
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public static void closeFactory() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
