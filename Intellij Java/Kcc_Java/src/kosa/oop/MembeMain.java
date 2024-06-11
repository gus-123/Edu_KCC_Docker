package kosa.oop;

public class MembeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();  // 객체생성 => 인스턴스화 : m1 => 인스턴스 변수
//		m1.name = "홍길동";  // 객체 초기화
//		m1.age = 20;
		
		m1.setName("홍길동");  // 객체 초기화
		m1.setAge(20);
		
		// m1= null;  // -> 주소값을 죽이면 오류 남.
		
		Member m2 = new Member();
//		m2.name = "박길동";
//		m2.age = 30;
		
		m1.printMember();
		System.out.println();
		m2.printMember();
		
		// test
		//Member m3 = new Member("오리", 30, null);
		System.out.println(m1.getAge());
		System.out.println(m1.getName());
		
		//m3.printMember();
//		m3.add(m3.addr);
	}

}
