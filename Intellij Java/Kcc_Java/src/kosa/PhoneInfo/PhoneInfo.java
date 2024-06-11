package kosa.PhoneInfo;


//상속 +  오브젝트 형변환 예제
// 부모 객체
public class PhoneInfo {
    // 필드 생성
    private String name;
    private String phoneNo;
    private String birth;

    // 생성자
    public PhoneInfo () {}

    public PhoneInfo (String name, String phoneNo, String birth) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.birth = birth;
    }

    // 메서드
    public void show() {
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phoneNo);
        System.out.println("생일 : " + birth);
    }

    
    // private 변수를 클래스 바깥에서 받기 위해 get 사용, 변경하기 위해 set 사용
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
