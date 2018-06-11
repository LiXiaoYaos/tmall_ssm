package com.dupeihui.tmall.comparator;

import com.dupeihui.tmall.pojo.Product;

import java.util.Comparator;

public class ProductAllComparator implements Comparator<Product> {

    @Override
    //综合比较器，把 销量*评价 高的放前面
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount() * p2.getReviewCount() - p1.getSaleCount() * p1.getReviewCount();
    }
}
