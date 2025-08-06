package com.dev.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpUtil {

    public static void forward(HttpServletRequest request, HttpServletResponse response, String path) {

        try {

            RequestDispatcher dispatcher = request.getRequestDispatcher(path);
            dispatcher.forward(request, response);

        } catch (Exception e) {
            System.out.println("forward 오류 : " + e);
        }


    }

}
