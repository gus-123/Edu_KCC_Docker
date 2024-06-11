package kosa.io;

import java.io.*;
import java.util.Arrays;

public class CopyUtil {

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
