package com.zking.test.model;

import java.util.ArrayList;
import java.util.List;

public class News {
    private Integer newsId;

    private String title;

    private List<Category> categories=new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", categories=" + categories +
                '}';
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public News(Integer newsId, String title) {
        this.newsId = newsId;
        this.title = title;
    }

    public News() {
        super();
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}