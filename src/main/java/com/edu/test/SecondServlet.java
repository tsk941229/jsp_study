package com.edu.test;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("SecondServlet!!");

        PrintWriter out = resp.getWriter();
        out.println("<html><head></head><title>test</title></head>");
        out.println("<body><h1>have a nice day!!</h1></body>");
        out.println("</html>");
        out.close();

    }
}
