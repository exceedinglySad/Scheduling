package com.defs.service;

import com.defs.dao.UserDao;
import com.defs.domain.User;
import com.defs.dto.LoginUser;
import lombok.Setter;

import java.util.List;

/**
 * @author fuyongping
 * @date 2020-11-03 19:42
 */
public class UserServiceImpl implements UserService {

    @Setter
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public List<User> queryAllUsers() {
        return userDao.queryAllUsers();
    }

    @Override
    public List<User> queryLoginUser(LoginUser loginUser) {
        return userDao.queryLoginUser(loginUser);
    }

    @Override
    public List<User> queryUserByName(String username) {
        return userDao.queryUserByName(username);
    }

    @Override
    public List<User> queryPartakeUser() {
        return userDao.queryPartakeUser();
    }
}
