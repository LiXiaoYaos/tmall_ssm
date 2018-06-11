package com.dupeihui.tmall.service;

import com.dupeihui.tmall.pojo.Category;
import com.dupeihui.tmall.pojo.Product;

import java.util.List;

public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);
    //为分类填充产品集合
    public void fill(Category category);
    //为多个分类填充产品集合
    public void fill(List<Category> categories);
    //为多个分类填充推荐产品集合
    public void fillByRow(List<Category> categories);

    //为产品设置销量和评价数量方法
    void setSaleAndReviewNumber(Product p);
    void setSaleAndReviewNumber(List<Product> ps);

    //模糊查询
    List<Product> search(String keyword);
}
