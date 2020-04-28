package com.panda.netty.http;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.*;

public class MyResponse2 {

    //SocketChannel的封装
    private ChannelHandlerContext ctx;

    private HttpRequest req;

    public MyResponse2(ChannelHandlerContext ctx, HttpRequest req) {
        this.ctx = ctx;
        this.req = req;
    }

    public void write(String out) throws Exception {
        if (out == null || out.length() == 0) {
            return;
        }
        // 设置http协议及请求头信息
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, Unpooled.wrappedBuffer(out.getBytes("UTF-8")));

        response.headers().set("Content-Type", "text/html;");
        ctx.write(response);
    }
}
