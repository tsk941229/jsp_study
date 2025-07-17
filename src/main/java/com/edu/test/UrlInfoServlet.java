package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlInfo")
public class UrlInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request 정보 출력 Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>요청 방식과 프로토콜 정보</h3>");
        out.println("Request URI : " + req.getRequestURI() + "<br/>");
        out.println("Request URL : " + req.getRequestURL() + "<br/>");
        out.println("Context Path : " + req.getContextPath() + "<br/>");
        out.println("Request Protocol : " + req.getProtocol() + "<br/>");
        out.println("Servlet Path : " + req.getServletPath() + "<br/>");
        out.println("</body>");
        out.println("</html>");
        out.close();


    }
}
