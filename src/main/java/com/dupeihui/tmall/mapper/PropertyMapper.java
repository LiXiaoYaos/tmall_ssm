package com.dupeihui.tmall.mapper;

import com.dupeihui.tmall.pojo.Property;
import com.dupeihui.tmall.pojo.PropertyExample;

import java.util.List;

public interface PropertyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Property record);

    int insertSelective(Property record);

    List<Property> selectByExample(PropertyExample example);

    Property selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Property record);

    int updateByPrimaryKey(Property record);
}