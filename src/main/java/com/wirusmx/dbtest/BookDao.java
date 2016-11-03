package com.wirusmx.dbtest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class BookDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addBook(Book book){
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
    }

    @SuppressWarnings("unchecked")
    public List<Book> booksList(){
        Session session = sessionFactory.getCurrentSession();
        List<Book> booksList = session.createQuery("from BOOKS").list();

        return booksList;
    }
}
