package com.modos.hibernate.entities;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Instructor.class)
                .buildSessionFactory()) {

            Instructor me  = new Instructor("Módos","Károly","modos.karoly92@gmail.com");
            InstructorDetail detail = new InstructorDetail("/modoskaroly","fishing");
            me.setInstructorDetail(detail);
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            System.out.println(session.get(InstructorDetail.class,5).getInstructor());

            session.getTransaction().commit();
        }

    }
}
