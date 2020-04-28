package com.panda.nio.servlet;

import com.panda.nio.http.MyRequest2;
import com.panda.nio.http.MyResponse2;
import com.panda.nio.http.MyServlet2;

public class SecondServlet extends MyServlet2 {
    @Override
    public void doPost(MyRequest2 request, MyResponse2 response) throws Exception {
        response.write("This is Second Servlet");
    }

    @Override
    public void doGet(MyRequest2 request, MyResponse2 response) throws Exception {
        this.doPost(request, response);
    }
}
