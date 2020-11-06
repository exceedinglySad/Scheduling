package com.defs.service;

import com.defs.dao.OrderDao;
import com.defs.dao.ResultDao;
import com.defs.dao.UserDao;
import com.defs.domain.Order;
import com.defs.domain.Result;
import com.defs.domain.User;
import com.defs.vo.ResultVO;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-05 19:47
 */
public class ResultServiceImpl implements ResultService {

    // 一次排班的天数
    public static Integer DAY_NUMS = 30;

    // 初始权限值
    private static Integer INIT_POWER = 1000;

    // 每次排班后权限值更改值
    private static Integer CHANGE_POWER = 10;

    @Setter
    private ResultDao resultDao;

    @Setter
    private UserDao userDao;

    @Setter
    private OrderDao orderDao;

    @Override
    public List<ResultVO> buildResult() {
        // 重新构建数据的时候需要先清空原有的全部数据
        resultDao.deleteAllData();
        List<User> allPartakes = userDao.queryPartakeUser();
        List<Order> allOrders = orderDao.queryAllOrders();
        // 排班后的结果数据
        List<Result> allResult = new ArrayList<Result>();
        // 初始化数据
        init(allPartakes);
        Collections.sort(allPartakes);
        for (int day = 0; day < DAY_NUMS; ++day) {
            for (Order order : allOrders) {
                Integer count = order.getNums();
                for (int i = 0; i < count; ++i) {
                    Result r1 = new Result();
                    r1.setDays(day + 1);
                    r1.setOrderId(order.getId());
                    User user = allPartakes.get(i);
                    r1.setUserId(user.getId());
                    user.setPower(user.getPower() + CHANGE_POWER);
                    allResult.add(r1);
                }
                Collections.sort(allPartakes);
            }
        }
        resultDao.buildResult(allResult);
        List<ResultVO> list = getResult();
        return list;
    }

    @Override
    public List<ResultVO> getResult() {
        return resultDao.getResult();
    }

    private void init(List<User> users) {
        users.forEach(stu -> stu.setPower(INIT_POWER));
        for (User user : users) {
            if (user.getRole().equals("客服班长")) {
                user.setPower(user.getPower() - 5);
            }
        }
    }
}
