package com.hyh.test;

import com.hyh.entity.Book;
import com.hyh.service.BookService;
import com.sun.tools.attach.VirtualMachineDescriptor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaohao
 * @create 2021-05-12 21:01
 */
public class JdbcTest {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.add(new Book("001","linglingyi","1"));

    }
    @Test
    public void testJdbcTemplate1(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        String count = bookService.selectCount();
        System.out.println(count);
    }
    @Test
    public void testJdbcTemplate2(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = bookService.findBook("1");
        System.out.println(book);
    }
    @Test
    public void testJdbcTemplate3(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> allBook = bookService.findAllBook();
        System.out.println(allBook);
    }
    @Test
    public void testJdbcTemplate4(){
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> args=new ArrayList<>();
        Object[] b1={"6","spring","j"};
        Object[] b2={"7","springboot","j"};
        args.add(b1);
        args.add(b2);

        bookService.batchUpdate(args);

    }
}
