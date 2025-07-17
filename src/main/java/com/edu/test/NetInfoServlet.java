package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request 정보 출력 Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>네트워크 관련 요청 정보</h3>");
        out.println("Request Scheme : " + req.getScheme() + "<br/>");
        out.println("Server Name : " + req.getServerName() + "<br/>");
        out.println("Server Address : " + req.getLocalAddr() + "<br/>");
        out.println("Server Port : " + req.getServerPort() + "<br/>");
        out.println("Client Address : " + req.getRemoteAddr() + "<br/>");
        out.println("Client Host : " + req.getRemoteHost() + "<br/>");
        out.println("Client Port : " + req.getRemotePort() + "<br/>");
        out.println("</body>");
        out.println("</html>");
        out.close();

    }
}
