package com.dev.controller;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class FrontController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    String charset = null;
    HashMap<String, Controller> list = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        charset = config.getInitParameter("charset");
        list = new HashMap<String, Controller>();
        list.put("/memberInsert.do", new MemberInsertController());
        list.put("/memberSearch.do", new MemberSearchController());

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding(charset);
        String url = request.getRequestURI();
//        String contextPath = request.getContextPath();
        String contextPath = "/dev";
        String path = url.substring(contextPath.length());
        Controller subController = list.get(path);
        subController.execute(request, response);

    }
}
