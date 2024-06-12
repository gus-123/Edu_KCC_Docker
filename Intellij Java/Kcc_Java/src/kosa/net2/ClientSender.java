package kosa.net2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSender extends Thread {
    private Socket socket;

    public ClientSender() {}

    public ClientSender(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 버퍼 저장

            PrintWriter writer = new PrintWriter(socket.getOutputStream());  // 대화 작성

            while (true) {  // 대화 종료를 위한 코드
                String str = br.readLine();
                if (str.equals("bye")) break;
                writer.println(str);
                writer.flush();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
