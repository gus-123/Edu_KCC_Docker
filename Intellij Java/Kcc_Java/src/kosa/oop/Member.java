package kosa.oop;

public class Member {
    //5.29
	// 회원정보에 대한 클래스와 객체를 생성 후 출력해 봅시다.
	// 회원 아이디 , 회원 비밀번호, 주소, 이름, 나이
//	String name;
//	int age;
	private String name;
	private int age;
	
	
	
//	public Member () {
//		
//	}
//	
//	public Member (String name, int age, String addr) {
//		this.name = name;
//		this.age = age;
//	}
			
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void printMember() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// test
//	public void add(String gi) {
//		if (gi == "경기도") {
//			System.out.println("맞음");
//		}
//		else {
//			System.out.println("틀림");
//		}
//	}

}
