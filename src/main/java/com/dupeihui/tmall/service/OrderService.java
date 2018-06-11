package com.dupeihui.tmall.service;

import com.dupeihui.tmall.pojo.Order;
import com.dupeihui.tmall.pojo.OrderItem;

import java.util.List;

public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order o);
    void delete(int id);
    void update(Order o);
    Order get(int id);
    List list();

    //事务管理同步增加order和修改orderItem，返回金额总数total
    float add(Order o, List<OrderItem> ois);

    //列出某个用户的订单信息，排除某些状态的订单
    List list(int uid, String excludedStatus);
}
