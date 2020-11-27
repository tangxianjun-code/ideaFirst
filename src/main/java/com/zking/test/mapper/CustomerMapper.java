package com.zking.test.mapper;

import com.zking.test.model.Customer;
import com.zking.test.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {
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