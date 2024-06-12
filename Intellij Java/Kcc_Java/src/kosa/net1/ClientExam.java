package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

    public static void main(String[] args) {
        // 1. 클라이언트 Socket 선언
        Socket socket = null;

        try {
            //2. 클라이언트 Socket 생성
            socket = new Socket("127.0.0.1", 9000);

            //3. 클라이언트 메시지 전송
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            String message = "Hi Server!!!!";
            out.write(message.getBytes());

            byte[] arr = new byte[1024];
            in.read(arr);

            System.out.println("서버가 보낸 메시지 : " + new String(arr));
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
