package com.zking.test.mapper;

import com.zking.test.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book>  load(Book book);

    int update(Book book);

    List<Book> select2(Book book);

    Book singSelcet(Book book);

    List<Map<String,Object>> selectAll();

    Map<String,Object> selectThere(Book book);
}