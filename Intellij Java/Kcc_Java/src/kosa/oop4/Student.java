package kosa.oop4;

public class Student extends Man {

    public Student () {

    }

    public Student (String name) {
        super(name);
    }

    public String speak() {
        System.out.println(getName() + "공부나 열심히해");

        return getName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
}
