package kosa.stram;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import static java.nio.file.Files.write;

public class KosaWriter {

    public static void main(String[] args) {
        //키보드로부터 문자열을 입력 받아 파일에 쓰는 예제를 구현하자.
        //"q"를 입력하기 전까지 문자열을 파일에 쓰도록 하자.
        //FileWriter : write(문자열)
        //파일명 : poem2.txt : 미리 생성 x
        // 코드 실행 후 리플래쉬 => 파일 생성 확인 o
        //close() 구현


        Scanner sc = new Scanner(System.in);
        FileWriter writer = null;
        String str = "";
        String poem = "";

        System.out.println("입력 :");
        while(!(str = sc.nextLine()).equals("q")) {
            poem += str;
            poem += "\n";
        }

        try {
            writer = new FileWriter("poem2.txt");
            writer.write(poem);
        }catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        /* 내꺼*/
        /*FileReader reader = null;
        FileWriter writer = null;
        Scanner sc = new Scanner(System.in);
        String fin = "q";

        try {
            while (true) {
                if (fin.equals(sc.nextLine())) {
                    System.out.println("종료");
                }
                else {
                    writer = new FileWriter("poem2.txt");
                    char input = sc.nextLine().charAt(0);
                    writer.write(input);
                }

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}
