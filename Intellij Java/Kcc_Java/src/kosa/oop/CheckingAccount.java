package kosa.oop;

public class CheckingAccount extends Account {

    private String cardNo;

    public CheckingAccount() {

    }

    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {  // 자식의 생성자
        super(accountNo, ownerName, balance);  // super 함수를 통해 부모의 생성자를 호출하여 상속 받는 내용 초기화
        this.cardNo = cardNo;
    }

    public int pay(String cardNo, int amount) throws Exception {  // 상속했기때문에 balance 값을 사용할수 있음.
        if(!this.cardNo.equals(cardNo) ||  getBalance() < amount) {  // 카드가 일치 하지 않거나 amount가 balance(전체금액)가 클때
            throw new Exception("결재 불능"); // 강제로 예외 처리
        }
        
        return withdraw(amount); // 상속하기 때문에 부모가 가지고 있는 메소드 사용 (카드 사용하면 금액이 차감 되기 때문
    }
}
