package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/errorTest1")
public class ErrorTest1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String getQuery = req.getQueryString();
        out.println("Query : " + getQuery + "<br/>");
        out.println("Query 길이 : " + getQuery.length());
        out.println("Done!");

        out.close();

    }
}
