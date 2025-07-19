package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        // 요청 body에 있는 데이터만 인코딩 함 (POST방식에 적절)
        // GET방식은 queryString이 uri로 넘어오기 때문에 html에서 <meta charset="UTF-8"> 선언하면 인코딩 문제가 해결됨
        req.setCharacterEncoding("utf-8");

        String id = req.getParameter("id");

        out.println("<html><head><title>Query 문자열 Test</title></head>");
        out.println("<body>");
        out.println("<h1>POST 방식 질의 문자열 추출</h1>");

        out.println("id : " + id + "<br/>");

        // getParameter 하면 스트림으로 가져올게 없어지나?
        ServletInputStream is = req.getInputStream();
        int length = req.getContentLength();

        byte[] buf = new byte[length];
        is.readLine(buf, 0, length);
        String s = new String(buf);

        out.println("전체 문자열 : " + s);

        out.println("</body></html>");
        out.close();

    }

}
