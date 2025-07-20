package com.edu.test;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context3")
public class ServletContextTest3Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        ServletContext sc = this.getServletContext();

        ShareObject obj1 = new ShareObject();

        obj1.setCount(100);
        obj1.setStr("객체 공유 테스트 - 1");
        sc.setAttribute("obj1", obj1);

        ShareObject obj2 = new ShareObject();
        obj2.setCount(200);
        obj2.setStr("객체 공유 테스트 - 2");
        sc.setAttribute("obj2", obj2);

        out.println("ServletContext 객체에 데이터를 등록했습니다.");

        out.close();

    }
}
