package com.itck.tcp;

import jdk.management.resource.internal.inst.SocketInputStreamRMHooks;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception{

        // 1 创建服务端socket， 等待客户端来接
        // 监听的端口要和客户端保持一致
        ServerSocket listen = new ServerSocket(8888);
        System.out.println("服务端等待客户端连接");
        // 等待客户端的连接，如果没有连接，会一直阻塞程序的执行
        Socket socket = listen.accept();

        // 2 建立连接后，接收数据、
        // 通过socket获取输入流对象
        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int length = inputStream.read(buff);
        System.out.println("服务端收到数据：" + new String(buff,0,length));

        OutputStream outputStream = socket.getOutputStream();
        System.out.println("服务端发送数据：" + "babybaby");
        outputStream.write("babybaby".getBytes());
        // 3 关闭socket
        socket.close();
    }
}
