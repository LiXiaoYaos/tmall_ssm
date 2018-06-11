package com.dupeihui.tmall.service;

import com.dupeihui.tmall.pojo.PropertyValue;
import com.dupeihui.tmall.pojo.Product;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}
