package com.dev.dao;

import com.dev.vo.MemberVO;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

    private static MemberDAO memberDAO = new MemberDAO();

    private MemberDAO() {}

    public static MemberDAO getInstance() {
        return memberDAO;
    }

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

    public void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("오류 발생 : " + e);
            }
        }
        close(conn, ps);
    }

    public void close(Connection conn, PreparedStatement ps) {
        if(ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                System.out.println("오류 발생 : " + e);
            }
        }
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("오류 발생 : " + e);
            }
        }
    }

    public void memberInsert(MemberVO member) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            conn = getConnection();
            pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getName());
            pstmt.setString(4, member.getMail());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("오류 발생 : " + e);
        } finally {
            close(conn, pstmt);
        }

    }

    public MemberVO memberSearch(String id) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        MemberVO member = null;

        try {

            conn = getConnection();
            pstmt = conn.prepareStatement("select * from member where id = ?");
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();

            if(rs.next()) {
                member = new MemberVO();
                member.setId(rs.getString("id"));
                member.setPassword(rs.getString("password"));
                member.setName(rs.getString("name"));
                member.setMail(rs.getString("mail"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(conn, pstmt, rs);
        }

        return member;

    }
}
