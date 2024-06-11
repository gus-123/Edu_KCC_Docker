package kosa.io;

import java.io.*;
import java.util.Arrays;

public class CopyUtil {

    //디렉리 복사 (해당 폴더 복사해서
    public static void copyDirectory(File source, File dest) {
        if (source.isDirectory()) {  // 디렉토리인지 확인
            dest.mkdir();  // 디렉터리 생성

            File[] fileList = source.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                File sourceFile = fileList[i];
                if (sourceFile.isDirectory()) {
                    //new file(디렉토리 경로, 파일이름);
                    copyDirectory(sourceFile, new File(dest, sourceFile.getName()));
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
}
