package com.zking.test.service;

import com.zking.test.model.News;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    News singSelect(Integer integer);
}