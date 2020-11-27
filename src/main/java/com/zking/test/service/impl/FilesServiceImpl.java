package com.zking.test.service.impl;

import com.zking.test.mapper.FilesMapper;
import com.zking.test.model.Files;
import com.zking.test.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    private FilesMapper filesMapper;
    @Override
    public int deleteByPrimaryKey(String fileId) {
        return 0;
    }

    @Override
    public int insert(Files record) {
        return filesMapper.insert(record);
    }

    @Override
    public int insertSelective(Files record) {
        return 0;
    }

    @Override
    public Files selectByPrimaryKey(String fileId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Files record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Files record) {
        return 0;
    }
}
