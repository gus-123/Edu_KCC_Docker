package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		//지역(로컬)변수 특징 2가지
		//1. 반드시 초기화 후 사용해야 한다.
		//2. 선언된 변수는 정의된 범위 안에서만 사용 가능하다.
		
		int num=0;
		
		num = num + 1;
		
		System.out.println(num);
		
		int a = 0;
		
		if(num==1) {
			a = 100;
		}
		
		System.out.println("a: " + a);
		
		int i = 1; // for문 밖에서도 i값을 사용하고 싶을때 이런 방식으로 코딩(의도나 목적을 볼것)
		for(; i<=10;i++) {
			System.out.print(i + "");
		}
		
		System.out.println("최종 i 값 : " + i);
		
//		for(int i = 1; i<=10;i++) {
//			System.out.print(i + "");
//		}
		
		// 변수 사용시 고민?
		// 1. 어떤 종류의 데이터 ? => 데이터 타입 선언 결정
		// 2. 데이터를 어디까지 사용? => 변수 선언 위치 결정
		
		// 연산자  % 
		
	    System.out.println(10%3);
	    
	    if(11% 2 == 0) {
	    	System.out.println("2의 배수");
	    }
	    else {
	    	System.out.println("2의 배수 아님");
	    }
	    
	    int num2 = 1;
	    
	    //num2 = num2 +1;
	    //num2 += num2;
	    
	    num2++;
	    
	    System.out.println(num2);
	    
	    int x = 10;
	    int y = 0;
	    
	    y = x++; //x를 먼저 넣은후 숫자 증가 (후위 연산자)
	    
	    System.out.println("x:" + x++);
	    System.out.println("y:" + y);
	    
	    System.out.println(x);
	    
	    double d = 3.14 + 1;
	    
	    if(d==4.14) {
	    	System.out.println("같다");
	    }else {
	    	System.out.println("다르다");
	    }
	    
	    System.out.println(d);  // 부동소수점 계산이 어려움
	    
	    int b =10;
	    int c = 20;
	    
	    int max=(b>c)?b:c;
	    
	    System.out.println(max);
	}

}
