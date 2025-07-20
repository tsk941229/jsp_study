package com.edu.test;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/threadTest")
public class ThreadTestServlet extends HttpServlet {

    String str;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");

        /*
            Servlet class의 멤버변수는 heap 메모리에 저장되는데,
            heap 메모리는 각 쓰레드끼리 공유하기 때문에
            요청별로 다른 변수를 사용할 땐 stack메모리에 저장되는 지역변수로 사용해야 한다
        */

        str = req.getParameter("msg");

        int number = 0;

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Multi Thread 테스트</title></head>");
        out.println("<body>");
        out.println("<h2>처리 결과 (멤버 변수)</h2>");
        while(number++ < 10) {
            out.print(str + " : " + number + "<br/>");
            out.flush();
            System.out.println(str + " : " + number);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        out.println("<h2> Done " + str + "!!</h2>");
        out.println("</body></html>");
        out.close();

    }
}
