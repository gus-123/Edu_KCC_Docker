package kosa.basic;

public class MethodExam {

	// 메서드 정의 (중복성이 있는 코드를 줄이기 위해 만듦(재사용성 증가))
	// 접근제어자, (static), 리턴형(void), 메서드 이름(파라미터(인자))
	public static void mon (String a, int b) {
		for(int i = 0; i< b; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	public static int add (int num1, int num2) {  // void는 return형을 사용할수 없음(return 갑의 형식을 맞추어 주어서 void를 변경 해주어야 함)
		int sum = num1 + num2;
		//System.out.println(sum);
		
		return sum;  // 출력하지 않고 값을 받아올라면 return을 사용
	}
	
	
	public static void main(String[] args) {  // 변수이름이 같아도 서로 다른 메모리 영역에 할당 되기때문에 메서드에서 했어도 선언을 다시 해야 함
		
//		mon("#", 7);
//		mon("!", 5);
//		mon("#", 15);
		
		int sum = add(10,20);
		System.out.println(sum);
	}

}
