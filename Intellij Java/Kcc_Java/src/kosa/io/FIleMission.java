package kosa.io;

import java.io.File;

public class FIleMission {
    public static void main(String[] args) {
        //1.바이트스트림을 이용하여 이미지 파일을 복사
//        String source = "C:\\server_program\\workspace\\Intellij Java\\images.jpg";
//        String dest = "C:\\Users\\KOSA\\Desktop\\test\\images.jpg";
//
//        CopyUtil copyUtil = new CopyUtil();
//
//        copyUtil.copyFile(new File(source), new File(dest));

        //2. 디렉토리 복사를 구현하자.
        String source = "C:\\server_program\\workspace\\Intellij Java";
        String dest = "C:\\Users\\KOSA\\Desktop\\test\\kosta";

        CopyUtil.copyDirectory(new File(source), new File(dest));
    }
}
