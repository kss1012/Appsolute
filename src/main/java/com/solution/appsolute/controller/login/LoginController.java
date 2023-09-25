package com.solution.appsolute.controller.login;

import com.solution.appsolute.dto.login.LoginDto;
import com.solution.appsolute.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login/login" ,method = RequestMethod.GET)
       public String getLogin() {
           return "/login/login";
       }

    @RequestMapping(value="/login/mypage", method = RequestMethod.POST)
       public String postLogin(@RequestParam String emp_num, @RequestParam String emp_password, RedirectAttributes redirectAttributes) {

           LoginDto loginDto = loginService.selectByEmp_num(Long.valueOf(emp_num));

           if (loginDto.getEmp_password().equals(emp_password)) {
               return "/login/mypage";
           } else {
               return "redirect:/login/login";
           }
       }
}
