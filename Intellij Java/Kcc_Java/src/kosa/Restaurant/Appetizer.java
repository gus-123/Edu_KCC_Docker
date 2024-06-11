package kosa.Restaurant;

public class Appetizer extends MenuItem {  // MenuItem 상속
    // 필드
    private String gluten;

    // 생성자
    public Appetizer () {}

    public Appetizer(String name, int price, String description, int balance, String gluten) {
        super(name, price, description, balance);  // MenuItem의 필드 값을 사용하기 위해 super() 사용
        this.gluten = gluten;
    }
    
    // 메서드 오버라이딩
    @Override
    public void printMenuItem() {
        super.printMenuItem();  // 부모 메서드 값을 출력
        System.out.println("글루텐 유무 :" + gluten);
    }

    // getter / setter

    public String getGluten() {
        return gluten;
    }

    public void setGluten(String gluten) {
        this.gluten = gluten;
    }
}
