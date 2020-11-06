package com.defs.service;

import com.defs.dao.OrderDao;
import com.defs.domain.Order;
import lombok.Setter;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-04 20:22
 */
public class OrderServiceImpl implements OrderService {

    @Setter
    private OrderDao orderDao;

    @Override
    public int addOrder(Order order) {
        return orderDao.addOrder(order);
    }

    @Override
    public int deleteOrderById(Integer id) {
        return orderDao.deleteOrderById(id);
    }

    @Override
    public int updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }

    @Override
    public Order queryOrderById(Integer id) {
        return orderDao.queryOrderById(id);
    }

    @Override
    public List<Order> queryAllOrders() {
        return orderDao.queryAllOrders();
    }
}
