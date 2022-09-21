package com.itck.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws Exception{

        // 1创建客户端socket对象
        Socket socket = new Socket("127.0.0.1",8888);
        // 2 发送数据
        // 向服务端写数据，借助于输出流
        OutputStream outputStream = socket.getOutputStream();
        String info = "wenjie hello";
        System.out.println("客户端发送数据：" + info);
        outputStream.write(info.getBytes());


        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int length = inputStream.read(buff);
        System.out.println("客户端读取数据：" + new String(buff,0,length));

        // 3 关闭socket
        socket.close();
    }
}
