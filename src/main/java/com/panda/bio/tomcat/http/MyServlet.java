package com.panda.bio.tomcat.http;

public abstract class MyServlet {

    //由Service方法来决定，是调用doGet或者调用doPost
    public void service(MyRequest request, MyResponse response) throws Exception {
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            doGet(request,response);
        } else {
            doPost(request,response);
        }
    }

    protected abstract void doPost(MyRequest request, MyResponse response) throws Exception;

    protected abstract void doGet(MyRequest request, MyResponse response) throws Exception;
}
