package com.dupeihui.tmall.service.impl;

import com.dupeihui.tmall.mapper.ReviewMapper;
import com.dupeihui.tmall.pojo.Review;
import com.dupeihui.tmall.pojo.User;
import com.dupeihui.tmall.service.ReviewService;
import com.dupeihui.tmall.service.UserService;
import com.dupeihui.tmall.pojo.ReviewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewMapper reviewMapper;
    @Autowired
    UserService userService;

    @Override
    public void add(Review c) {
        reviewMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        reviewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Review r) {
        reviewMapper.updateByPrimaryKeySelective(r);
    }

    @Override
    public Review get(int id) {
        return reviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Review> list(int pid) {
        ReviewExample example = new ReviewExample();
        example.createCriteria().andPidEqualTo(pid);
        example.setOrderByClause("id desc");

        List<Review> result = reviewMapper.selectByExample(example);
        setUser(result);
        return result;
    }

    @Override
    public int getCount(int pid) {
        return list(pid).size();
    }

    private void setUser(Review review){
        int uid = review.getUid();
        User user = userService.get(uid);
        review.setUser(user);
    }

    private void setUser(List<Review> reviews){
        for(Review review:reviews)
            setUser(review);
    }
}
