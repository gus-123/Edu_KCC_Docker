package kosa.oop4;

public class Reader extends Man implements Speakable {

    public Reader() {

    }

    public Reader(String name) {
        super(name);
    }

    public String speak() {
        System.out.println(getName() + " 자바화이팅");

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
