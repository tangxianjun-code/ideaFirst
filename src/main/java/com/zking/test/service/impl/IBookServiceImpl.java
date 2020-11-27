package com.zking.test.service.impl;

import com.zking.test.mapper.BookMapper;
import com.zking.test.model.Book;
import com.zking.test.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;
    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public List<Book> select2(Book book) {
        return bookMapper.select2(book);
    }

    @Override
    public Book selectByPrimaryKey(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }

    @Override
    @Cacheable("bookSingSelect")
    public Book singSelcet(Book book) {
        return bookMapper.singSelcet(book);
    }

    @Override
    public List<Book> load() {
        return  bookMapper.load(null);
    }
}
