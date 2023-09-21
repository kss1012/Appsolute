package com.solution.appsolute.dao.login;

import com.solution.appsolute.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    Employee login(LoginDto loginDto);
}
