package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		// 래퍼런스 타입 -> 인터페이스, 클래스, 배열, enum
		Account account; // 참조형(클래스 타입)  => 각 각의 클래스 타입이 다 데이터 타입이 될수 있음.
		account = new Account("111-111", "홍길동", 22300); // 객체 생성(메모리 할당 및 메모리 주소값 전달)
		
		//StringBuffer sb =new StringBuffer("abc", 3.14); // 외부 API는 객체를 생성할때 메뉴얼을 봐야 함.
		
//		account.accountNo = "111-111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
		
		//account .deposit(5000);
		try {
			account.withdraw(13000); // 호출할때 부터 예외 발생 시킬수 있으니깐 유의 (예외를 처리 했기때문에 금액 상관 없음)
		} catch (Exception e) {
			e.printStackTrace();
		}  
		
		
		System.out.println("계좌번호 : " + account.accountNo);
		System.out.println("계좌주 : " + account.ownerName);
		System.out.println("전액 : " + account.balance);
		
		
	}

}
