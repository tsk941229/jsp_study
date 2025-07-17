package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request 정보 출력 Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>요청 헤더 정보</h3>");

        Enumeration<String> em = req.getHeaderNames();

        while (em.hasMoreElements()) {
            String s = em.nextElement();
            out.println(s + " : " + req.getHeader(s) + "<br/>");
        }

        out.println("</body>");
        out.println("</html>");
        out.close();



    }
}
