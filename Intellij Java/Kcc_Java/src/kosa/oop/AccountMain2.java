package kosa.oop;

public class AccountMain2 {

    public static void main(String[] args) {

        /* 3번째 */
//        부모 -> 자식 x
//        자식 -> 부모 o

        // 부모의 데이터 타입이기 때문에 한곳에 모임 (데이터 타입을 부모로 캐스팅)
//        CheckingAccount-> Account -> CheckingAccount
        Account arr[] = {
                new Account("111-111", "홍길동", 10000),
                new CheckingAccount("111-111", "홍길동", 20000, "222-222"),
                new MinusAccount("333-333", "김길동", 30000, 20000)
        };

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof CheckingAccount) {  //arr[i]가 CheckingAccount로 캐스팅 가능 여부를 검사를 하여 실행 그것을 해주는게 instanceof
                try {
                    ((CheckingAccount)arr[i]).pay("222-222", 5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(arr[1].getBalance());


        /* 2번째 */
//		// 부모로 형변환
//		Account ca = new CheckingAccount("111-111", "홍길동", 10000, "222-222");
//
//		CheckingAccount obj = (CheckingAccount) ca;  // 강제 형변환
//
//		try {
//			obj.pay("222-222", 3000);  // 부모로 형 변환 후 자신만이 가지고 있는 메소드는 더 이상 접근 X
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//
//		System.out.println(ca.getBalance());

        /* 1번째 */
//    	//형을 바꾸지 않으면 안되는 경우일때
//
//    	//부모 데이터 타입 = new 자식 데이터 타입
//    	// 실제 생성된건 자식 데이터 타입인데  부모데이터 타입으로  형을 바꾸면 pay는 자식에 만 있어서 오류남.
//    	Account ca = new CheckingAccount("111-111", "홍길동", 10000, "222-222");  // 자식이 부모의 데이터 타입이 될수 있음
//
//		// 다시 자식으로 강제 형 변환
//		CheckingAccount ca2 = (CheckingAccount) ca;
//
//		try {
//			ca2.pay("222-222", 3000);
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//
//		System.out.println(ca.getBalance());

        /*AccountMain2*/
//        CheckingAccount ca = new CheckingAccount("111-111", "홍길동", 10000, "222-222");  // 계좌번호, 이름, balance, 카드 번호
//
//        try {
//            ca.pay("222-222", 3000);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//
//
//        System.out.println(ca.getBalance());
    }
}
