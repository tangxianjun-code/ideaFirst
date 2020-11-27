package com.zking.test.mapper;

import com.zking.test.model.Book;
import com.zking.test.service.IBookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;



public class BookMapperTest extends javaTest{

    private Book book;
    @Autowired
    private IBookService bookService;
    @Before
    public void setUp() throws Exception {
        book=new Book();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void load() {
        List<Book> list = bookService.load();

        for (Book book1 : list) {
            System.out.println(book1);
        }
    }

    @Test
    public void update() {
    }

    @Test
    public void select2() {
    }

    @Test
    public void singSelcet() {
        book.setBookId(42);
        Book book = bookService.singSelcet(this.book);
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void selectThere() {
    }
}