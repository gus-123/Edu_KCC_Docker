package kosa.io;

import java.io.*;
import java.util.Scanner;

public class Dos {

    //private static String source = "C:\\Users\\KOSA\\Downloads\\Default";

    //디렉리 복사 (해당 폴더 복사해서
    public static void copyDirectory(File source, File dest) {
        if (source.isDirectory()) {  // 디렉토리인지 확인
            dest.mkdir();  // 디렉터리 생성

            File[] fileList = source.listFiles();  // 폴더로 들어왔을때 파일들을 리스트에 추가
            for (int i = 0; i < fileList.length; i++) {
                File sourceFile = fileList[i];
                if (sourceFile.isDirectory()) {
                    //new file(디렉토리 경로, 파일이름);
                    File s_destFile = new File(dest, sourceFile.getName());
                    copyDirectory(sourceFile, s_destFile);
                }else {
                    File destFile = new File(dest, sourceFile.getName());
                    copyFile(sourceFile, destFile);  // 파일 복사
                }
            }
        }
    }

    //바이트 값을 가진 파일 1개를 복사하는 메서드
    public static void copyFile(File source, File dest) {


        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;

        byte[] arr = new byte[1024];

        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(dest);

            while ((data = fis.read(arr)) != -1) {
                fos.write(arr, 0, data);
            }

            System.out.println("복사완료");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    public static void mkdirDirectory(File source, File dest, String name) {
        File dir = new File(source.getAbsolutePath(), name);
        if (source.isDirectory()) {
            if (!dir.exists()) {  // 파일이 존재 하지 않을 경우
                if (dir.mkdir()) {  // 파일 생성
                    System.out.println(name + " 폴더를 만들었습니다.");
                } else {
                    System.out.println(name + " 폴더를 만들 수 없습니다.");
                }
            }else {  // 파일이 존재 할 경우
                System.out.println(name + " 폴더는 이미 존재합니다.");
            }
        }
    }

    public static void saveFile(File source, File dest, String fileName) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter(fileName + ".txt"));

            System.out.println("입력 :");
            String str= "";

            while ((str = br.readLine()) != null) {
                str += "\n";
                bw.write(str);
            }

            System.out.println("쓰기 완료");
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    public String getSource() {
//        return source;
//    }
//    public void setSource(String source) {
//        this.source = source;
//    }
}
