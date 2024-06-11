package kosa.io;

import java.io.*;

public class Main {

    Member m;

    //객체 직렬화
    public void insert() {
        m = new Member("홍길동", 20, new Video("1", "서울의 봄", "정우성"));  // 객체 생성
        ObjectOutputStream oos = null; // 스트림 초기화
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.ser"));  // 파일 생성
            oos.writeObject(m);  // 파일 입력

        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                oos.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //객체 역직렬화
    public void show() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.ser"));  // 파일 안에 객체를 읽어드림
            m = (Member) ois.readObject();  // readObject는 캐스팅 한다.
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                ois.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Main main = new Main();  // 객체 생성

        main.insert();
        main.m = null;  // 멤버 객체를 파일에 밖에 없음
        main.show();

        System.out.println(main.m);
    }
}
