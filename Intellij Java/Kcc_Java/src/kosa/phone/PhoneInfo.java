package kosa.phone;
//5.29
public class PhoneInfo implements Comparable{ // implements Comparable<PhoneInfo>
	// 클래스 만들기 (전화번호 하나에 대한 도메인)
	// (name, phoneNo, birth) : 필드
	// 1. 필드 생성 / 2. 초기화 해야할 필드를 생각
	private String name;
	private String phonNo;
	private String birth;

	// 3. 생성자 생성
	public PhoneInfo() {

	}
	
	public PhoneInfo(String name, String phonNo, String birth) {
		super();
		this.name = name;
		this.phonNo = phonNo;
		this.birth = birth;
	}
	
	// 4. 메서드 생성
	public void show() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phonNo);
		System.out.println("생년월일: " + birth);
	}

//	@Override
//	public int compareTo(Manager o) {
//		if ((int)birth.compareTo(o.birth) < 0  ) {
//			return -1;
//		} else if (birth.compareTo(o.birth) > 0) {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PhoneInfo p = (PhoneInfo) o;
		return this.name.compareTo(p.getName());
	}

	// get / set 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonNo() {
		return phonNo;
	}

	public void setPhonNo(String phonNo) {
		this.phonNo = phonNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}	

}
