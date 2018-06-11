package com.dupeihui.tmall.service.impl;

import com.dupeihui.tmall.pojo.CategoryExample;
import com.dupeihui.tmall.mapper.CategoryMapper;
import com.dupeihui.tmall.pojo.Category;
import com.dupeihui.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    //public List<Category> list(Page page) {
    //    return categoryMapper.list(page);
    //}

    //public int total(){
    //    return categoryMapper.total();
    //}

    public List<Category> list(){
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

    public void add(Category category){
        categoryMapper.insert(category);
    }

    public void delete(int id){
        categoryMapper.deleteByPrimaryKey(id);
    }

    public void update(Category category){
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    public Category get(int id){
        return categoryMapper.selectByPrimaryKey(id);
    }

}
