package kosa.api;

public class Person {
    private String name;
    private int age;

    public Person() {

    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /* obj 클래스에 있는 객체들은 오버라이딩해서 사용함. */
    @Override
    public boolean equals(Object obj) {  // obj로 들어오는건 main 에서 p2
        Person p = (Person) obj; // objcect를 다시 자식으로 형변환

        if (name.equals(p.getName()) && age == p.getAge()) {  // 즉.p.getName() 이거 p2
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    /* end */

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
}
