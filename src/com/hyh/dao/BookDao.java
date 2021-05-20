package com.hyh.dao;

import com.hyh.entity.Book;

import java.util.List;

/**
 * @author yaohao
 * @create 2021-05-12 20:17
 */
public interface BookDao {
    void add(Book book);

    String selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBookInfo();

    void batchUpdateBook(List<Object[]> batchArgs);
}
