package com.solution.appsolute.dao.login;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoginDto {
    private int empNum;
    private String empPassword;
}
