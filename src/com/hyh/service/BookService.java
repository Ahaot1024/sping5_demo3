package com.hyh.service;

import com.hyh.dao.BookDao;
import com.hyh.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaohao
 * @create 2021-05-12 20:17
 */
@Service
public class BookService {
    //注入BookDao
    @Autowired
    private BookDao bookDao;

    public void add(Book book) {
        bookDao.add(book);
    }
    public String selectCount(){
        return bookDao.selectCount();
    }
    public Book findBook(String id){
        return bookDao.findBookInfo(id);
    }
    public List<Book> findAllBook(){
        return bookDao.findAllBookInfo();
    }
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

}
