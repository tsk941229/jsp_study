package com.edu.biz;

import com.edu.beans.Member;
import com.edu.dao.MemberDAO;

public class MemberService {

    MemberDAO dao = new MemberDAO();

    public void insertMember(Member member) {
        dao.insertMember(member);
    }

}
