package com.wirusmx.dbtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("spring_config");
        BookDao bookDao = (BookDao) context.getBean("bookDao");


        bookDao.addBook(new Book("book1", "author1", 11111));

        List<Book> bookList = bookDao.booksList();
        if (bookList != null) {
            for (Book book: bookList){
                System.out.println(book);
            }
        }
    }
}
