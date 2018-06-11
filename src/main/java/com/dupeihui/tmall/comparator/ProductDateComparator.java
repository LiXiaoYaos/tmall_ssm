package com.dupeihui.tmall.comparator;

import com.dupeihui.tmall.pojo.Product;

import java.util.Comparator;

public class ProductDateComparator implements Comparator<Product> {
    @Override
    //新品比较器，把创建日期晚的放前面
    public int compare(Product p1, Product p2) {
        return p1.getCreateDate().compareTo(p2.getCreateDate());
    }
}
