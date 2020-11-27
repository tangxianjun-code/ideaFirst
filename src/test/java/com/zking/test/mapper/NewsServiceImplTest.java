package com.zking.test.mapper;

import com.zking.test.model.News;
import com.zking.test.service.INewsService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsServiceImplTest extends javaTest{

    private News news1;
    @Autowired
    private INewsService newsService;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void singSelect() {
        News news = newsService.singSelect(1);
        System.out.println(news);

    }
}