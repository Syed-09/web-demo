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
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "registerServlet", value = "/registration")//mapping for servlet
public class RegisterServlet extends HttpServlet {
    User user = null;
    private final String userId = "Amit";
    private final String pwd = "0987";

    public void init(){
        user = new User();
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("pwd");
        //System.out.println("Username: "+ userName + " Password: "+passWord);

        List<User> userList = Arrays.asList(new User("King","123"),
                new User("Queen","123"),
                new User("Joker","123"));

        if (userId.equals(userName) && pwd.equals(password)){

            Cookie loginCookie = new Cookie("user", userName);
            loginCookie.setMaxAge(15*60);
            response.addCookie(loginCookie);
            request.setAttribute("userList", userList);

            String baseUrl = request.getContextPath();
            //baseUrl = http://localhost:8080/web_demo_war_exploded/

            //response.sendRedirect(baseUrl+"/register.jsp");

            //If you want to pass some data, use this instead of sendRedirect
            RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
            rd.forward(request,response);
        }

        else{
            //Invoke this, if we give incorrect credentials
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");

            PrintWriter out = response.getWriter();
            out.println("<font color=red>Username or password is incorrect</font>");

            rd.include(request,response);
        }

//        user.setUserName(userName); //using lombok for setters and getters
//        user.setPassword(password);

        /* String greet = "Hello "+userName;
        request.setAttribute("key",greet);//

        RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
        rd.forward(request,response);*/
    }
}

