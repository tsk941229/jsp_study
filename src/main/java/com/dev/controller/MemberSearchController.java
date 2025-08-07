package com.dev.controller;

import com.dev.dao.MemberDAO;
import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberSearchController implements Controller {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = (String) request.getParameter("id");
        String job = (String) request.getParameter("job");
        String path = null;

        if(job.equals("search")) {
            path = "/dev/memberSearch.jsp";
        } else if(job.equals("update")) {
            path = "/dev/memberUpdate.jsp";
        } else if(job.equals("delete")) {
            path = "/dev/memberDelete.jsp";
        }

        // 유효성 체크
        if(id.isEmpty()) {
            request.setAttribute("error", "ID를 입력해주시기 바랍니다.");
            HttpUtil.forward(request, response, path);
            return;
        }

        // Service 객체의 메소드 호출
        MemberService memberService = MemberService.getInstance();
        MemberVO member = memberService.memberSearch(id);

        // Output View 페이지로 이동
        if(member == null) {
            request.setAttribute("result", "검색된 정보가 없습니다.");
        }

        request.setAttribute("member", member);

        if(job.equals("search")) {
            path = "/dev/memberSearchOutput.jsp";
        }

        HttpUtil.forward(request, response, path);


    }
}
