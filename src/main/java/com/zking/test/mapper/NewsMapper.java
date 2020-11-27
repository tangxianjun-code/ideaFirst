package com.zking.test.mapper;

import com.zking.test.model.News;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    News singSelect(Integer integer);
}