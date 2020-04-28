package com.panda.bio.tomcat.servlet;

import com.panda.bio.tomcat.http.MyRequest;
import com.panda.bio.tomcat.http.MyResponse;
import com.panda.bio.tomcat.http.MyServlet;

public class SecondServlet extends MyServlet {
    @Override
    protected void doPost(MyRequest request, MyResponse response) throws Exception {
        response.write("This is Second Servlet");
    }

    @Override
    protected void doGet(MyRequest request, MyResponse response) throws Exception {
        this.doPost(request, response);
    }
}
