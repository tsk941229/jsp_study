package com.edu.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

@MultipartConfig
@WebServlet("/fetchTest")
public class FetchTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String birth = req.getParameter("birth");

        System.out.println("name = " + name);
        System.out.println("birth = " + birth);

        HashMap<String, Object> map = new HashMap<>();

        map.put("status", 200);

        out.println(map);

        out.close();

    }
}
