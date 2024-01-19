package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 간단한 8081 웹서버 생성
public class Webserver1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081); // 포트 지정
            System.out.println("8081 서비스 시작");
            while(true) {
                try(Socket socket = serverSocket.accept()) { // Socket : 통신 라이브러리
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World"; // response 내용 - http1.1프로토콜사용, 정상상태
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8")); // 사용자한테 httpRes를 되돌려줌
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
