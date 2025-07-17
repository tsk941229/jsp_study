package com.edu.test;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request 정보 출력 Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>추가적인 요청 정보</h3>");
        out.println("Request Method : " + req.getMethod() + "<br/>");
        out.println("Path Info : " + req.getPathInfo() + "<br/>");
        out.println("Path Translated : " + req.getPathTranslated() + "<br/>");
        out.println("Query String : " + req.getQueryString() + "<br/>");
        out.println("Content Length : " + req.getContentLength() + "<br/>");
        out.println("Content Type : " + req.getContentType() + "<br/>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

}
