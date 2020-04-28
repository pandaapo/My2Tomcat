package com.panda.netty.servlet;

import com.panda.netty.http.MyRequest2;
import com.panda.netty.http.MyResponse2;
import com.panda.netty.http.MyServlet2;

public class FirstServlet extends MyServlet2 {
    @Override
    public void doGet(MyRequest2 request, MyResponse2 response) throws Exception {
        this.doPost(request, response);
    }

    @Override
    public void doPost(MyRequest2 request, MyResponse2 response) throws Exception {
        response.write("This is First Servlet");
    }
}
