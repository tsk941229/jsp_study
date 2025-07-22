package com.edu.test;

import javax.servlet.*;
import java.io.IOException;

public class FlowFilterTwo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init() 호출 ... two");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        System.out.println("doFilter() 호출 전 ... two");

        chain.doFilter(req, resp);

        System.out.println("doFilter() 호출 후 ... two");

    }

    public void destroy() {
        System.out.println("destroy() 호출 ... two");
    }

}


