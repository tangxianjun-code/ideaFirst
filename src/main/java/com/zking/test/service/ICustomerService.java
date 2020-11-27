package com.zking.test.service;

import com.zking.test.model.Customer;
import com.zking.test.model.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ICustomerService {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> load(Customer customer);

    int addCustomer(Customer customer);

    int delete(Customer customer);
}