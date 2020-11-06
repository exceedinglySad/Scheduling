package com.defs.dao;

import com.defs.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-03 18:28
 */
public interface UserDao {
    //增加一个User
    int addUser(User user);

    //根据id删除一个User
    int deleteUserById(@Param("id") Integer id);

    //更新User
    int updateUser(User user);

    //根据id查询,返回一个User
    User queryUserById(@Param("id") Integer id);

    //查询全部User,返回list集合
    List<User> queryAllUsers();

    //根据userName模糊查询用户
    List<User> queryUserByName(@Param("username") String username);

    //获取到全部参与排班的人员
    List<User> queryPartakeUser();
}
