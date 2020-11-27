package com.zking.test.service.impl;

import com.zking.test.mapper.OrderMapper;
import com.zking.test.model.Order;
import com.zking.test.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return 0;
    }

    @Override
    public int insert(Order record) {
        return 0;
    }

    @Override
    public int insertSelective(Order record) {
        return 0;
    }

    @Override
    public Order selectByPrimaryKey(Integer orderId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return 0;
    }

    @Override
    public int add(List<Order> orders) {
        return orderMapper.add(orders);
    }

    @Override
    public int delete(Integer cid) {
        return orderMapper.delete(cid);
    }
}
