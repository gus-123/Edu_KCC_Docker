package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {
    public static void main(String[] args) {
        //파일(poem.txt)에 있는 문자열 데이터를 읽어오기

        FileReader reader = null;
        char[] arr = new char[100];


        try {
            // FileReader 생성
            reader = new FileReader("poem.txt");  // 빨대 생성

            // 2번 방식
            while (true) {
                Arrays.fill(arr, ' ');
                int data = reader.read(arr);
                if(data == -1) break;
                System.out.println(arr);

            }
            // 1번 방식
//            while (true) {
//                int data = reader.read();  // 데이터를 읽음 - 아스키 값이 리턴 됨.
//                if (data == -1) {
//                    break;
//                }
//                else {
//                    System.out.print((char) data);
//                }
//            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
