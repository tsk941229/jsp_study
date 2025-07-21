package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie3")
public class CookieTest3Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int cnt = 0;

        Cookie[] cookies = req.getCookies();

        for(Cookie c : cookies) {
            if(c.getName().equals("count")) {
                cnt = Integer.parseInt(c.getValue());
            }
        }

        cnt++;
        Cookie c = new Cookie("count", cnt+"");
        c.setMaxAge(60*60*24*10);
        resp.addCookie(c);

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>방문 횟수 : "+cnt+"</h1>");
        out.close();

    }
}
