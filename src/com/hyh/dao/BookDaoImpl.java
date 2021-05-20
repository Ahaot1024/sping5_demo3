package com.hyh.dao;

import com.hyh.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author yaohao
 * @create 2021-05-12 20:17
 */
@Repository
public class BookDaoImpl implements BookDao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql="insert into t_book values(?,?,?)";
        //可以把可变参数提取出来放在数组里面
        Object[] args={ book.getId(), book.getBookName(), book.getBookStatus()};
        //返回值是表的影响行数
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public String selectCount() {
        String sql="select count(*) from t_book";
        //requiredType返回值的类型
        String count = jdbcTemplate.queryForObject(sql, String.class);
        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql="select * from t_book where book_id=?";
        //RowMapper是一个接口，针对返回不同类型的数据，使用相应的接口实现类可以完成数据的封装，例如BeanPropertyRowMapper<Book>(Book.class)
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findAllBookInfo() {
        String sql="select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql="insert into t_book values(?,?,?)";
        //返回值ints是没个添加的影响行数数组
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
