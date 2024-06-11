package kosa.PhoneInfo;

public class Company extends PhoneInfo{  // PhoneInfo 상속
    // 필드
    private String dept; // 부서
    private String position;  // 직위

    // 생성자
    public Company () {

    }

    public Company(String name, String phoneNo, String birth, String dept, String position) {
        super(name, phoneNo, birth);  // PhoneInfo의 필드를 사용하기 위해 super()를 사용
        this.dept = dept;
        this.position = position;
    }

    // getter / setter
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
