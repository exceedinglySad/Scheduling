package com.defs.service;

import com.defs.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-04 20:21
 */
public interface OrderService {
    //增加一个班次(Order)
    int addOrder(Order order);

    //根据id删除一个班次(Order)
    int deleteOrderById(@Param("id") Integer id);

    //更新班次(Order)
    int updateOrder(Order order);

    //根据id查询,返回一个班次(Order)
    Order queryOrderById(@Param("id") Integer id);

    //查询全部班次(Order),返回list集合
    List<Order> queryAllOrders();
}
