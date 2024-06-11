package kosa.io;

import java.io.File;

public class FileExam {

    public static void show(File file) {
        File list[] = file.listFiles();

        for (int i = 0; i < list.length; i++) {
            if (list[i].isDirectory()) {
                System.out.println();
                System.out.println("**" + list[i].getName() + "**");
                show(list[i]);
            }else {
                System.out.println("-" + list[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        String path = "C:\\server_program\\workspace\\Intellij Java";  // 경로 지정 공유

        File file = new File(path);
        show(file);

//        File f = new File(path);
//
//        if(f.isDirectory()) {
//            System.out.println("디렉토리 입니다.");
//            System.out.println(f.getName());  // 디렉토리 이름 변경
//            File[] arr = f.listFiles();
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i].getName());
//            }
//        }
//        else {
//            System.out.println("파일 입니다.");
//        }
    }

}


//String path =  "C:\\server_program\\workspace\\Intellij Java\\Kcc_Java\\src\\kosa\\api";
//
//File currentFolder = new File(path);
//File parentFolder = currentFolder.getParentFile();
//File grandParentFolder = parentFolder.getParentFile();
//
//        if (grandParentFolder != null) {
//File[] files0 = currentFolder.listFiles();
//            if (files0 != null) {
//        for (File file : files0) {
//        System.out.println(file.getName());
//        }
//        }
//File[] files1 = parentFolder.listFiles();
//            if (files1 != null) {
//        for (File file : files1) {
//        System.out.println(file.getName());
//        }
//        }
//File[] files2 = grandParentFolder.listFiles();
//            if (files2 != null) {
//        for (File file : files2) {
//        System.out.println(file.getName());
//        }
//        }
//        }
