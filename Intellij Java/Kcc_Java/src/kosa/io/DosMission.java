package kosa.io;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DosMission {
    static String source = "C:\\Users\\KOSA\\Downloads\\Default";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            //source = "C:\\Users\\KOSA\\Downloads\\Default";
            String dest = "C:\\Users\\KOSA\\Desktop\\test\\kosta";

            File currentFile = new File(source);
            System.out.print("> ");
            String str = sc.nextLine();
            switch (str) {
                case "ls":  // clear
//                    System.out.println("현재 경로 : " + currentFile);
//                    Dos.copyDirectory(new File(source), new File(dest));
                    System.out.println("현재 경로: " + currentFile);
                    for (File file : currentFile.listFiles()) {
                        System.out.println(file.isDirectory() ? file.getName() + "/" : file.getName());
                    }
                    //Dos.copyDirectory(new File(source), new File(dest));
                    break;
                case "cd" :
                    System.out.println("1. 자식 디렉토리 이동 2. 부모 디렉토리 이동");
                    String num = sc.nextLine();
                    if (num.equals("1")) {
                        System.out.println("입력 :");
                        String mon = sc.nextLine();
                        String source1 = source + "\\" + mon;
                        //System.out.println(source1);
//                        File f = new File(source);
//                        String[] arr = source.split("\\");
//                        for (int i = 0; i < arr.length; i++) {
//                            arr[i] += mon;
//                        }
                        DosMission.source = source1;
                        System.out.println(source);
                        System.out.print("현재 경로 : " + source1);
                        break;
                    }
                    else if (num.equals("2")) {
                        String source1 = currentFile.getParent();

                        source = source1;
                        System.out.println("현재 경로 : " + source);
                    }
                    break;

                case "mkdir" :
                    System.out.print("만들고 싶은 디렉토리 이름 : ");
                    String name = sc.nextLine();
                    Dos.mkdirDirectory(new File(source), new File(dest), name);
                    break;
                case "vi" :
                    System.out.println("파일 이름 : ");
                    String fileName = sc.nextLine();
                    Dos.saveFile(new File(source), new File(dest), fileName);
                case "q":
                    return;
                default:
                    break;
            }
        }
    }
}
