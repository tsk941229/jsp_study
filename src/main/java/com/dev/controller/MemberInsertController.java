package com.dev.controller;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberInsertController implements Controller {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 파라미터 추출
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");

        // 유효성 체크
        if(id.isEmpty() || password.isEmpty() || name.isEmpty() || mail.isEmpty()) {
            request.setAttribute("error", "모든 항목을 빠짐없이 입력해주시기 바랍니다!");
            HttpUtil.forward(request, response, "/dev/memberInsert.jsp");
            return;
        }

        // VO 객체에 데이터 바인딩
        MemberVO member = new MemberVO();
        member.setId(id);
        member.setPassword(password);
        member.setName(name);
        member.setMail(mail);

        // Service 객체의 메소드 호출
        MemberService memberService = MemberService.getInstance();
        memberService.memberInsert(member);

        // Output View 페이지로 이동
        request.setAttribute("id", id);
        HttpUtil.forward(request, response, "/dev/result/memberInsertOutput.jsp");

    }
}
