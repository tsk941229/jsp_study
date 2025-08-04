package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class MyCustomTag2 extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {

        System.out.println("커스텀 태그의 바디가 실행되기 전");

        for(int i=0; i<10; i++) {
            getJspBody().invoke(null);
        }

        getJspBody().invoke(null);
        System.out.println("커스텀 태그의 바디가 실행된 후");

    }
}
