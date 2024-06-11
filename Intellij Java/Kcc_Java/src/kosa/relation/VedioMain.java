package kosa.relation;

import kosa.oop.CheckingAccount;

public class VedioMain {
	//5.29
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video c1 = new Video("1", "트랜스포머1", "서봉수");
		Video c2 = new Video("2", "트랜스포머2", "오봉수");
		Video c3 = new Video("3", "트랜스포머3", "기봉수");
		
		Human s1 = new Human("1", "홍길동", "주소1");
		Human s2 = new Human("2", "박길동", "주소2");

		/*오브젝트 예제 시작*/
		// GeneralMember 와 SpecialMember를 함꼐 배열에 넣고
		// 각각의 rental(), show 호출 출력
		// 특히 SpecialMember는 specialPrint() 호출되도록 하여라.

		Human arr[] = {
				new Human("1", "홍길동", "주소1"),
				new SpecialMember("2", "박길동", "주소2", 100)
		};

		for (int i = 0; i < arr.length; i++) {
			//arr[i].addVideo(videos[i]);
			arr[i].printVideo();
			if(arr[i] instanceof SpecialMember) {
				((SpecialMember)arr[i]).specialPrint();
			}
		} /* 오브젝트 예제 end */

		
//		SpecialMember sm = new SpecialMember("a", "박길동", "동탄", 100);
//		sm.addVideo(c1);
//
//		s1.addVideo(c1);
//		s1.addVideo(c2);
//
//		s2.addVideo(c2);
//		s2.addVideo(c3);
//
//		s2.removeVideo(c3);
//
//		s1.printVideo();
//		System.out.println();
//		s2.printVideo();
//		sm.printVideo();
//		System.out.println("=============================");
//
//		c2.printHuman();
	}

}
