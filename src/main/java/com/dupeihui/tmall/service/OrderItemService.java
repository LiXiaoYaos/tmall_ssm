package com.dupeihui.tmall.service;

import com.dupeihui.tmall.pojo.Order;
import com.dupeihui.tmall.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
    void add(OrderItem oi);
    void delete(int id);
    void update(OrderItem oi);
    OrderItem get(int id);

    List list();
    void fill(Order o);
    void fill(List<Order> os);

    //根据产品获取销售量的方法
    int getSaleCount(int pid);

    List<OrderItem> listByUser(int uid);
}
