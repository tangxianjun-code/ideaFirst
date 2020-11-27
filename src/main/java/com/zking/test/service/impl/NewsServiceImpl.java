package com.zking.test.service.impl;

import com.zking.test.mapper.NewsMapper;
import com.zking.test.model.News;
import com.zking.test.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;
    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return 0;
    }

    @Override
    public int insert(News record) {
        return 0;
    }

    @Override
    public int insertSelective(News record) {
        return 0;
    }

    @Override
    public News selectByPrimaryKey(Integer newsId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return 0;
    }

    @Override
    public News singSelect(Integer integer) {
        return newsMapper.singSelect(integer);
    }
}
