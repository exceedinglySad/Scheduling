package com.defs.service;

import com.defs.domain.User;
import com.defs.dto.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

/**
 * @author fuyongping
 * @date 2021-01-02 12:14
 */
public class LoginServiceImpl implements LoginService {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Override
    public boolean isExistsLoginUser(LoginUser loginUser) {
        List<User> userList = userService.queryLoginUser(loginUser);
        if(userList==null || userList.size()==0){
            return false;
        }
        return true;
    }
}
