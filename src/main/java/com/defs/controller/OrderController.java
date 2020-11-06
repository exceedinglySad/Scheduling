package com.defs.controller;

import com.defs.domain.Order;
import com.defs.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-04 20:27
 */
@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    @Qualifier("orderService")
    private OrderService orderService;

    /**
     * 查询全部的班次
     * @param model
     * @return
     */
    @RequestMapping("/allOrders")
    public String list(Model model) {
        List<Order> list = orderService.queryAllOrders();
        model.addAttribute("list", list);
        return "order/allOrders";
    }

    /**
     * 跳转到添加班次界面
     * @return
     */
    @RequestMapping("/toAddOrder")
    public String toAddPaper() {
        return "order/addOrder";
    }

    /**
     * 保存新添加的班次
     * @param order
     * @return
     */
    @RequestMapping("/addOrder")
    public String addPaper(Order order) {
        System.out.println(order);
        orderService.addOrder(order);
        return "redirect:/order/allOrders";
    }

    /**
     * 跳转到更新班次页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/toUpdateOrder")
    public String toUpdateOrder(Model model, Integer id) {
        Order order = orderService.queryOrderById(id);
        System.out.println(order);
        model.addAttribute("order",order );
        return "order/updateOrder";
    }

    /**
     * 保存更改后的班次信息
     * @param order
     * @return
     */
    @RequestMapping("/updateOrder")
    public String updateOrder( Order order) {
        System.out.println(order);
        orderService.updateOrder(order);
        return "redirect:/order/allOrders";
    }

    /**
     * 删除班次信息
     * @param id
     * @return
     */
    @RequestMapping("/del/{orderId}")
    public String deleteOrder(@PathVariable("orderId") int id) {
        orderService.deleteOrderById(id);
        return "redirect:/order/allOrders";
    }

}
