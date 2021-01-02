package com.defs.service;

import com.defs.dto.LoginUser;

/**
 * @author fuyongping
 * @date 2021-01-02 12:08
 */
public interface LoginService {
    //登录用户是否存在
    boolean isExistsLoginUser(LoginUser loginUser);
}
