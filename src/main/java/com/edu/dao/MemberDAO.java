package com.edu.dao;

import com.edu.beans.Member;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

    public Connection getConnection() {

        try {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");

            return ds.getConnection();

        } catch (NamingException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void insertMember(Member member) {

        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");

            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getName());
            pstmt.setString(4, member.getMail());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
