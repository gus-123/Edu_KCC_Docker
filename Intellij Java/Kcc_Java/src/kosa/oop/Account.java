package kosa.oop;

public class Account {
	//계좌객체 생성 하기 위해
	// 객체로 부터 공통된 데이터 구조와 기능을 추출
	// 상태(데이터) : 계좌 번호, 계좌주, 잔액 => 멤버변수(멤버필드)
	// 행동(기능) : 입금하다. 출금하다. => 멤버메서드(static을 붙이지 않음)
	String accountNo; // 계좌번호
	String ownerName; // 계좌주
	int balance; // 잔액
	
	//생성자(return / void 안씀 , 클래스 이름과 같아야 한다.)
	// 오버로딩 : 이름은 서로 같지만 파라미터의 갯수 데이터 타입을 가지고 구분
	public Account() {  // 디폴트 생성자 중요!! 
		// the constructor Account() is undefined 오류가 디폴트 생성자가 없으면 발생 한다.
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		//super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//입금하다.
	public void deposit(int amount) {  // 멤버메서드(받을 값에 대한 매개 변수)
		balance += amount;
	}
	
	//출금하다.
	public int withdraw(int amount) throws Exception {  // throws Exception는 호출하는 입장에서 예외를 처리 용도
		if(balance < amount) {
			throw new Exception("잔액부족");  // 강제 예외 발생을 시키기 위해서 throw를 사용
			
		}
		
		balance -= amount;
		
		return amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
