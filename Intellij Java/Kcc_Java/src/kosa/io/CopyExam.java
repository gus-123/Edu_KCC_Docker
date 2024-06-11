package kosa.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyExam {

    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("poem2.txt");

            writer = new FileWriter("pome2copy.txt");

            char[] arr = new char[100];

            //Arrays.fill(arr, ' ');
            while (true) {
                Arrays.fill(arr, ' ');
                int data = reader.read(arr);
                if(data == -1) {
                    break;
                }

                writer.write(arr);
//                else {
//                    arr[i] = (char) data;
//                }
            }
            System.out.println("복사 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                writer.close();
                reader.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
