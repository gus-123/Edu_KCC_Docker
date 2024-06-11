package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇 ex) 문자, 정수, 실수, 논리 형 
		// byte, short, int, long, float, double, char, boolean => 기본형 데이터 타입  : 실제 데이터를 다루는 것 (primitive type) 
		int num;  // 변수를 선언 => 메모리 할당 됨.
		int arr[]; // 배열을 선언 : Object Type => 참조 데이터를 다루는 것(참조형 데이터 타입)
		// 지역변수는 반드시 초기화를 해주어야 하다.
		
		num = 10;
		
		//변수 선언, 초기화
		int num2 = 100;
		
		//문자열 : String(오브젝트 타입)
		String name = "홍길동";
		
		System.out.println(name + "님");	
		
		// 변수 선언 주의 사항 
		//변수명 : 특수문자x, 숫자로 시작x, 소문자 시작, _
		
		// 기본 리터널 : 100 => int, "" => Strting, 'A' => char, true => boolean, 31.4 => double
		float a = 3.14f;
		
		//casting (형 변환)
		//기준 : byte < short < int(21억 자리) < long < flaot < double, int <=> char (이건 아스키 코드로 나옴)
		double b = 100; //기본리터널이 int인데 double이 더 커서 자동으로 캐스팅 되는것을 묵시적 형변환 이라고 함.
		int c = (int)3.14; // 강제형 변환( 데이터의 손실 발생)
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100L;		
		
		int num5 = 010; // 8진수
		System.out.println(num5);
		
	}

}
