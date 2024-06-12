package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
    public static void main(String[] args) {
        // 1. 서버 소켓을 선언
        ServerSocket serverSocket = null;
        Socket socket = null;  // 클라이언트 소켓

        try {
            //2. 서버 소켓을 생성
            serverSocket = new ServerSocket(9000);
            System.out.println("서버 실행 중........");

            //3. 클라이언트 소켓을 받아옴
            socket = serverSocket.accept();

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            //4. 배열로 데이터를 받음
            byte[] arr = new byte[1024];
            in.read(arr);

            System.out.println("클라이어트에서 보낸 메시지 : " + new String(arr));  // 문자열로 출력

            String message = "Hello Client!!!";
            out.write(message.getBytes());  // string을 바이트로

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
