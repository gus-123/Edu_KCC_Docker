package kosa.oop4;

public class Main {

    public static void main(String[] args) {
        Object obj[] = {new Reader("둘리"), new Work("길동"),
                new Student("마이콜")};

        for (int i = 0; i < obj.length; i++) {
            if (!(obj[i] instanceof Student)) {
                ((Speakable)obj[i]).speak();
            }
//            if (obj[i] instanceof Speakable) {
//                Speakable speakable = (Speakable)obj[i];   //Speakable implement를 공유하기 때문에 Speakable로 형변환 가능 (interface 이름으로 데이터 타입)
//                System.out.println(speakable.speak());
//            }
        }


    }
}
