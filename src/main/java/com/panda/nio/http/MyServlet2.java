package com.panda.nio.http;

public abstract class MyServlet2 {
    public void service(MyRequest2 request, MyResponse2 response) throws Exception {

        //由Service方法来决定，是调用doGet或者调用doPost
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            doGet(request, response);
        } else {
            doPost(request, response);
        }
    }

    public abstract void doPost(MyRequest2 request, MyResponse2 response) throws Exception;

    public abstract void doGet(MyRequest2 request, MyResponse2 response) throws Exception;
}
