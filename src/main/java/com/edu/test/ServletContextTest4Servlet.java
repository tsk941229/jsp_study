package com.edu.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        ServletContext context = this.getServletContext();

        ShareObject obj1 = (ShareObject) context.getAttribute("obj1");
        ShareObject obj2 = (ShareObject) context.getAttribute("obj2");

        out.println("DATA 1 : " + obj1.getCount() + " , " + obj1.getStr() + "<br/>");
        out.println("DATA 2 : " + obj2.getCount() + " , " + obj2.getStr() + "<br/>");

        out.close();

    }
}
