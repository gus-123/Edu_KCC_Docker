package kosa.io;

import java.io.*;

public class BufferExam {
    public static void main(String[] args) {
        //Scanner => 키보드로 데이터 입력
        //System.in => InputStream(byte) => InputStreamReader(byte -> 문자 한자) => BufferedReader(키보드 값을 읽어드림)

//        InputStream in = System.in;
//        InputStreamReader isr = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(isr);
        
        
        // 순서 Buffer -> 파일 방식(읽기, 쓰기) -> System.in
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter("output.txt"));
            
            System.out.println("입력 :");
            String str= "";
            
            while ((str = br.readLine()) != null) {
                str += "\n";
                bw.write(str);
            }
            
            System.out.println("쓰기 완료");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                br.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
