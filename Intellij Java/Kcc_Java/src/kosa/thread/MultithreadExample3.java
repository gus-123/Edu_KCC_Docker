package kosa.thread;

public class MultithreadExample3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new SmallLetters());

        thread.start();

        char arr[] = {'ぁ', 'い', 'ぇ', 'け', 'げ', 'し','じ','ず','せ','ぜ','そ','ぞ'};

        for (char ch : arr) {
            System.out.println(ch);

        }
    }
}
