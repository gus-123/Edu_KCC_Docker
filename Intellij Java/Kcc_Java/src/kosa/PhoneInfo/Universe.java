package kosa.PhoneInfo;

public class Universe extends PhoneInfo { // PhoneInfo 상속
    // 필드
    private String major;  // 전공
    private String year;  // 학번

    // 생성자
    public Universe () {}

    public Universe (String name, String phoneNo, String birth, String major, String year) {
        super(name, phoneNo, birth); // PhoneInfo의 필드를 사용하기 위해 super()를 사용
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
