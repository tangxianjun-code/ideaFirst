package com.zking.test.service;

import com.zking.test.model.Files;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FilesService {
    int deleteByPrimaryKey(String fileId);

    int insert(Files record);

    int insertSelective(Files record);

    Files selectByPrimaryKey(String fileId);

    int updateByPrimaryKeySelective(Files record);

    int updateByPrimaryKey(Files record);
}