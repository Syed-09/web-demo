package com.example.webdemo;

import com.example.webdemo.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

@WebServlet(name = "logoutServlet", value = "/logout")//mapping for servlet
public class LogoutServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //to delete the cookies (ctrl+shift+i --> Application --> Cookies)
        Cookie myCookie = null;
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for (Cookie cookie: cookies){
                cookie.setMaxAge(0);
            }
        }
        String baseUrl = request.getContextPath();
        //baseUrl = http://localhost:8080/web_demo_war_exploded/

        response.sendRedirect(baseUrl+"/logout.jsp");
        Cookie loginCookie = new Cookie("user", "");
        loginCookie.setMaxAge(0);
    }

}

