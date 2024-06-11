package kosa.basic;

public class ExceptionExam {

	public static void noEqueals(int a, int b) throws Exception {  // throws Exception (소극적 예외 처리 방식)
		if(a == b) {
			throw new Exception("같은 값 안돼");
		}
	}
	
	public static void main(String[] args) {
		// 1. 자바 상의 예외 처리 할떄
		// 2. 비즈니스 모델 상에 인위적으로 예외 발생 시킴.
		// 3. 인위적 발생 될때 안될때
		
		try {
			System.out.println("1");  
			noEqueals(10,10); //예외 발생 2번 안됨
			noEqueals(20,10); //예외 발생 안됬기 때문에 3번 안됨
			System.out.println("2");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3"); 
		} finally {
			System.out.println("4");  
		}
		System.out.println("5"); 
		
		try {
			//예외 처리
			noEqueals(10,10);
		} catch (Exception e) {
			// 예외에 대한 메시지 출력
			e.printStackTrace();
		}
		
		System.out.println("done...");  // 예외를 처리 했기때문에 실행 됨.
		
	}

}
