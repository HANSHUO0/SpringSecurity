package com.hs.hello;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *
 * @Auther: Administrator
 * @Data: 2022/1/17 0017 16:11
 */
@Controller
public class HelloController {

    /*@PostMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"  "+password);
        if ("user".equals(username) && "123".equals(password)){
            request.getRequestDispatcher("/hello").forward(request,response);
        }
    }*/
}
