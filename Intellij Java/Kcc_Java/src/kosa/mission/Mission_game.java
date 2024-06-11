package kosa.mission;

import java.util.Scanner;

public class Mission_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 수
		int T = sc.nextInt();
		
		for(int i = 1; i <=T; i++) {
			int jongh = sc.nextInt();
			int jongo = sc.nextInt();
			int day = 0;
			
			while (jongo <= jongh) {
					jongh = jongh * 2;
					jongo = jongo * 3;
					
					day++;
				
			}
		    System.out.println("#" + i + " " + day);

		
		}
	}
}


