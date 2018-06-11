package com.dupeihui.tmall.service;

import com.dupeihui.tmall.pojo.Category;

import java.util.List;

public interface CategoryService {
    //List<Category> list(Page page);

    //int total();

    List<Category> list();

    void add(Category category);

    void delete(int id);

    void update(Category category);

    Category get(int id);
}
