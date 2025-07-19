package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String password = req.getParameter("pwd");
        String[] hobbies = req.getParameterValues("hobby");
        String queryString = req.getQueryString();

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Query 문자열 Test</title></head>");
        out.println("<body>");
        out.println("<h1>GET 방식으로 요청되었습니다</h1>");

        out.println("ID : " + id + "<br/>");
        out.println("PW : " + password + "<br/>");
        out.println("취미 : ");
        for(String hobby : hobbies) {
            out.println(hobby + " ");
        }
        out.println("<br/>");
        out.println("queryString : " + queryString + "<br/>");

        out.println("</body></html>");
        out.close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("id");
        String password = req.getParameter("pwd");
        String[] hobbies = req.getParameterValues("hobby");
        String queryString = req.getQueryString();

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Query 문자열 Test</title></head>");
        out.println("<body>");
        out.println("<h1>POST 방식으로 요청되었습니다</h1>");

        out.println("ID : " + id + "<br/>");
        out.println("PW : " + password + "<br/>");
        out.println("취미 : ");
        for(String hobby : hobbies) {
            out.println(hobby + " ");
        }
        out.println("<br/>");
        out.println("queryString : " + queryString + "<br/>");

        out.println("</body></html>");
        out.close();
    }
}
