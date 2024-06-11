package kosa.oop3;

public class Person {
    // 필드
    private String name;
    private Role role;

    // 생성자
    public Person() {}

    public Person(String name,Role role) {
        this.name = name;
        this.role = role;
    }

//    public Person(Role role) {
//        this.role = role;
//    }

    // 메서드
    public void doIt () {
        System.out.println("이름 : " + name);
        role.doing();
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
