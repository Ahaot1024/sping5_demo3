package com.hyh.entity;

import org.springframework.stereotype.Component;

/**
 * @author yaohao
 * @create 2021-05-12 20:36
 */
@Component
public class Book {
    private String id;
    private String bookName;
    private String bookStatus;

    public Book() {
    }

    public Book(String id, String bookName, String bookStatus) {
        this.id = id;
        this.bookName = bookName;
        this.bookStatus = bookStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                '}';
    }
}
