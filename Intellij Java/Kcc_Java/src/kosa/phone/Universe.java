package kosa.phone;

public class Universe extends PhoneInfo {
    private String major;  // 전공
    private String year;  // 학번
    private Universe arr[];
    private int count;

    public Universe() {
        arr = new Universe[10];
    }

    public Universe(String name, String phonNo, String birth, String major, String year) {
        super(name, phonNo, birth);
        this.major = major;
        this.year = year;
    }

    /* 기능을 한곳에 넣는 게 좋음 */
    public void addUniverse() {
        System.out.print("이름: ");
        String name = DataInput.sc.nextLine();
        System.out.print("전화번호: ");
        String phoneNo = DataInput.sc.nextLine();
        System.out.print("생년월일: ");
        String birth = DataInput.sc.nextLine();
        System.out.print("부서: ");
        String major = DataInput.sc.nextLine();
        System.out.print("위치: ");
        String year = DataInput.sc.nextLine();

        arr[count++] = new Universe(name, phoneNo, birth, major, year);
    }

    public void listPhoneInfo() {
        for (int i = 0; i < count; i++) {
            arr[i].show();
        }
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
