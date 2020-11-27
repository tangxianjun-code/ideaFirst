package com.zking.test.mapper;

import com.zking.test.model.Customer;
import com.zking.test.model.Order;
import com.zking.test.service.ICustomerService;
import com.zking.test.service.IOrderService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceImplTest extends javaTest{

    private Customer customer;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IOrderService orderService;
    @Before
    public void setUp() throws Exception {
        customer=new Customer();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void load() {
        customer.setCustomerId(1);
        List<Customer> load = customerService.load(customer);
        for (Customer order : load) {
            System.out.println(order.toString());
        }
    }

    @Test
    public void add() {
        customer.setCustomerName("你没了");
        customerService.addCustomer(customer);
        Order order=new Order();
        order.setOrderNo("P11");
        order.setCid(customer.getCustomerId());
        Order order1=new Order();
        order1.setOrderNo("P12");
        order1.setCid(customer.getCustomerId());
        List<Order> list=new ArrayList<>();
        list.add(order);
        list.add(order1);
        orderService.add(list);
    }

    @Test
    public void delete() {
        customer.setCustomerId(8);
        orderService.delete(customer.getCustomerId());
        customerService.delete(customer);
    }


}