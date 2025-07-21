package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logProc")
public class LogInOutServlet extends HttpServlet {

    // 로그인 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        HttpSession session = req.getSession();

        if(id.isEmpty() || pw.isEmpty()) {
            out.println("ID 또는 비밀번호를 입력해주세요.");
            return;
        }

        if(session.isNew() || session.getAttribute("id") == null) {
            session.setAttribute("id", id);
            session.setAttribute("pw", pw);
            out.println("로그인 완료");
        } else {
            out.println("이미 로그인 상태입니다.");
        }

        out.close();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(false);

        if(session != null) {
            session.invalidate();
            out.println("로그아웃 완료");
        } else {
            out.println("로그인 상태가 아닙니다.");
        }

        out.close();

    }
}
