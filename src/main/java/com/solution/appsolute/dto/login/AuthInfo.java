package com.solution.appsolute.dto.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class AuthInfo {
        private Long emp_num;
       private String emp_name;
       private int dept_no;
       private String emp_position;
       private int emp_leader;
       private Integer emp_mgr;
}
