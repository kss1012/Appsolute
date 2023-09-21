package com.solution.appsolute.controller.login;

import com.solution.appsolute.dao.login.LoginDto;
import com.solution.appsolute.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login/login", method = RequestMethod.GET)
        public String getEmpAddress() {

            return "/login/login";
        }

    @RequestMapping(value = "/login/mypage", method = RequestMethod.POST)
        public String login(@ModelAttribute LoginDto loginDto, RedirectAttributes redirectAttributes) {
            try {
                loginService.login(loginDto);
                return "/login/mypage";
            } catch (Exception e) {
                // 회원가입 실패 처리
                redirectAttributes.addFlashAttribute("error", "로그인에 실패했습니다. 다시 시도해주세요.");
                return "redirect:/login/login";
            }
        }
}
