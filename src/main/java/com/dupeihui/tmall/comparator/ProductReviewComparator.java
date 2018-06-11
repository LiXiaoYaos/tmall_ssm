package com.dupeihui.tmall.comparator;

import com.dupeihui.tmall.pojo.Product;

import java.util.Comparator;

public class ProductReviewComparator implements Comparator<Product> {
    @Override
    //人气比较器，把评价数量多的放前面
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount() - p1.getReviewCount();
    }
}
