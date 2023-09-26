package com.solution.appsolute.dto.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginDto {
    private Long emp_num;
    private String emp_password;
    private String emp_name;
    private int dept_no;
    private String emp_position;
    private int emp_leader;
    private Integer emp_mgr;


}
