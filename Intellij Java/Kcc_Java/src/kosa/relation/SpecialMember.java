package kosa.relation;

public class SpecialMember extends Human{
	private int bonusPoint;
	
	public SpecialMember() {
		
	}

	public SpecialMember(String id, String name, String addr, int bonusPoint) {
		super(id, name, addr);
		this.bonusPoint = bonusPoint;
	}
	
//	public void show() {
////		System.out.println("회원 아이디: " + id);
////		System.out.println("회원 이름: " + name);
////		System.out.println("회원 주소: " + address);
////		rentalVideo.show();
//		super.printVideo();
//		System.out.println("보너스 포인트: " + bonusPoint);
//	}

	@Override
	public void addVideo(Video video) {
		// TODO Auto-generated method stub
		super.addVideo(video);
		this.bonusPoint += 100;
	}

	@Override
	public void printVideo() {
		// TODO Auto-generated method stub
		super.printVideo();
		System.out.println("보너스 포인트: " + bonusPoint);
	}

	public void specialPrint() {
		System.out.println("스페셜 영어");
	}
	
	
}
