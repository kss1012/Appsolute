package com.solution.appsolute.service.login;

import com.solution.appsolute.dao.login.LoginDao;
import com.solution.appsolute.dao.login.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public void login(LoginDto loginDto) {

        loginDao.login(loginDto);
    }
}
