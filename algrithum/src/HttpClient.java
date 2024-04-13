package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HttpClient {public static void main( String[] args) throws IOException {
    // 服务器地址及端口
    String host = "127.0.0.1";
    int port = 8080;
    // 建立TCP连接的Socket
    Socket socket = new Socket(host, port);
    // 建立Socket输入输出流
    BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    // 发送请求
    out.println("GET /index.html HTTP/1.0");
    out.println();   // 分割请求头和请求体的空白行
    out.flush();
    // 返回响应报文
    String line;
    // 客户端关闭Socket会返回null
    while((line = in.readLine()) != null) {
        System.out.println(line);
    }
    //关闭IO流
    in.close();
    out.close();
}
}
