package com.springbook.biz.user.impl;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    //  의존성 주입을 위한 함수
    //  setter 의존성 주입
    public void setUserDAO(UserDAO dao) {
        userDAO = dao;
    }

    public UserVO getUser(UserVO vo) {
        return userDAO.getUser(vo);
    }


}
