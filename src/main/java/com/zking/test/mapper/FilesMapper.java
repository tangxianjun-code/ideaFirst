package com.zking.test.mapper;

import com.zking.test.model.Files;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesMapper {
    int deleteByPrimaryKey(String fileId);

    int insert(Files record);

    int insertSelective(Files record);

    Files selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(Files record);

    int updateByPrimaryKey(Files record);
}