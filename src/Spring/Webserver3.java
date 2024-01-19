package Spring;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
                // 사용자 HTTP 요청
//                POST / HTTP/1.1
//                Host: localhost:8081
//                Content-Type: application/x-www-form-urlencoded
//                Content-Length: xx

//                userInput=helloworld

            while(true) {
                try(Socket socket = serverSocket.accept()) {
//                    사용자로부터 HTTP 요청 한줄씩 읽어오기
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                    읽어온 요청 저장
                    StringBuilder sb = new StringBuilder();
                    String line;
                    while(!(line = br.readLine()).isBlank()) {// 입력이 없을때까지 반복
                        sb.append(line + "\n");
                    }
                    if(sb.toString().contains("POST")) { // 읽어온 요청이 "POST"를 포함하면
                        char[] buffer = new char[1024];
                        br.read(buffer); // POST 요청의 body를 읽어옴
                        System.out.println("POST body data : " + new String(buffer)); // body 출력
                        System.out.println("POST all data : " + sb.toString()); // 전체 HTTP 요청 출력
                    }
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "OK";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8")); // 사용자에게 응답 보내기
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
