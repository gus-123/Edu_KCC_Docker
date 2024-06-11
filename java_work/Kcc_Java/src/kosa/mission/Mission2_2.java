package kosa.mission;

public class Mission2_2 {

//	public static int hap (int number) {
//		int[] a = new int[3];
//		int sum =0;
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = number;
//			
//			sum += a[i];
//		}
//		
//		
//		return sum;
//	}
//	
//	public static void main(String[] args) {
//		// 성적관리프로그램에서 여러명의 성적을 구현해 보자.
//		// 번호  국어 영어  수학  총점  평균
//		//  1  90  80  70  240  80
//		//  2  50  40  30  120  40
//		//================
//		//       90  120  100
//		//       45  60    50
//		
//		
//		int score[][] = {{90,80,70}, {50,40,30}};
//		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
//		for (int i = 0; i < score.length; i ++) {
//			
//			int num = i+1;
//			
//			System.out.print(num);
//			for (int j = 0; j < score[i].length; j++) {	
//
//				//System.out.println((i+1) + score[i][j] + score[i][j+1] + score[i][j+2] + );
//				
//				int scores = score[i][j];
//				
//				hap(scores);
//			
//				System.out.print("\t" +scores + hap(scores));
//				
//			}
//			System.out.println();
//		}
//		System.out.println("===================");
//		
//		int hap1 = 0, avg1 = 0;
//		for (int i = 0; i < score.length; i ++) {
//			for(int j = 0; i < j; i ++) {
//				hap1 += score[i][j];
//				avg1 = hap1 / (i+1);
//				System.out.println("\t" + hap1 + avg1);
//			}
//		}
	
	public static void main(String[] args) {
		// 성적관리프로그램에서 여러명의 성적을 구현해 보자.
		// 번호  국어 영어  수학  총점  평균
		//  1  90  80  70  240  80
		//  2  50  40  30  120  40
		//================
		//       90  120  100
		//       45  60    50
	
		int score[][] = {{90,80,70}, {50,40,30}};
		
		int korTotal = 0;
		int engTotal = 0;
		int matTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i = 0; i<score.length; i++) {
			int sum = 0;
			int avg = 0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i+1) +"\t");
			for (int j =0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j]+ "\t");
			}
			
			avg = sum / score[i].length;
			System.out.print(sum + "\t");
			System.out.println(avg + "\t");
		} //end for
		System.out.println("==========================");
		System.out.print("\t" + korTotal);
		System.out.print("\t" + engTotal);
		System.out.println("\t" + matTotal);
		
		
		System.out.print("\t" + korTotal/score.length);
		System.out.print("\t" + engTotal/score.length);
		System.out.println("\t" + matTotal/score.length);
	}

}
