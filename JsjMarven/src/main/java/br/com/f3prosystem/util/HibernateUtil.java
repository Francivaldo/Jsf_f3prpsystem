
package br.com.f3prosystem.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;


public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            System.out.println("tentando configurar a SF");
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            System.err.println("Ocorreu erro em iniciar a  SF.");
        } catch (Throwable ex) {
            
            System.err.println("Ocorreu erro em iniciar a  SF." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
