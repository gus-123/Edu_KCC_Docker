package kosa.mission;

public class HomeWork {

	public static void main(String[] args) {
		// 1-1
//		int[][] arr0 = new int[5][5];
//		int num = 1;
//		
//		for(int i = 0; i < arr0.length; i++) {
//			for(int j =0; j < arr0.length; j++ ) {
//				
//				arr0[i][j] = num;
//				
//				System.out.printf("%d \t", arr0[i][j]);
//				
//				num += 1;
//			}
//			System.out.println();
//		}
		
		// 1-2
//		int[][] arr0 = new int[5][5];
//		int num = 0;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				num = i * 5 + j + 1;
//				arr0[i][j] = num;
//			}
//		}
//
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 1-3
//		int[][] arr0 = new int[5][5];
//		int num = 1;
//		
//		for(int i = 0; i < arr0.length; i++) {
//			for(int j =0; j < arr0.length; j++ ) {
//				
//				arr0[i][j] = num;
//				
//				System.out.printf("%d \t", arr0[i][j]);
//				
//				num += 2;
//			}
//			System.out.println();
//		}
		
		// 1-4
//		int[][] arr0 = new int[5][];
//
//		for (int i = 0; i < arr0.length; i++) {
//			arr0[i] = new int[i + 1];
//			for (int j = 0; j < arr0[i].length; j++) {
//				arr0[i][j] = j + 1;
//			}
//		}
//
//		for (int i = 0; i < arr0.length; i++) {
//			for (int j = 0; j < arr0[i].length; j++) {
//				System.out.print(arr0[i][j] + " ");
//			}
//			System.out.println();
//		}

		// 1-5
//		int[][] arr0 = new int[5][5];
//		int num = 1;
//
//		for(int i = 0; i < arr0.length; i++) {
//			for(int j =0; j < i+1; j++ ) {
//
//				arr0[i][j] = num;
//
//				System.out.printf("%2d \t", arr0[i][j]);
//
//				num += 1;
//			}
//			System.out.println();
//		}

		// 1-6
//		int[][] arr0 = new int[5][];
//		for(int i = 0; i< arr0.length; i++) {
//			arr0[i] = new int [5-i];
//			for(int j = 0; j < arr0[i].length; j++) {
//				arr0[i][j] = j + 1;
//
//				System.out.print(arr0[i][j] + " ");
//			}
//			System.out.println();
//		}

		// 1-7
//		int[][] arr0 = new int[5][];
//		int num = 1;
//
//		for(int i = 0; i< arr0.length; i++) {
//			arr0[i] = new int [5-i];
//			for(int j = 0; j < arr0[i].length; j++) {
//				arr0[i][j] = num;
//				num++;
//
//				System.out.printf("%2d \t", arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 1-8
//		int[][] arr0 = new int[5][5];
//		int num = 1;
//
//		for(int i = 0; i < arr0.length; i ++) {
//			for(int j = 0; j < arr0[i].length; j++) {
//				arr0[i][j] = i * 1 + j + 1;
//				num++;
//
//				System.out.printf("%2d \t", arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 1-9
//		int[][] arr0 = new int[5][5];
//
//		for(int i = 0; i < arr0.length; i ++) {
//			for(int j = 0; j < arr0[i].length; j++) {
//				arr0[i][j] = (i + j) % 5 + 1;
//
//				System.out.printf("%2d \t", arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 1-10
//		int[][] arr0 = new int[5][5];
//		int num = 1;
//
//		for (int i = 0; i< arr0.length; i++) {
//			for(int j = 4; j >= 0; j--) {
//				if (i<j) {
//					arr0[i][j] = 0;
//				}
//				else {
//					arr0[i][j] = num;
//					num++;
//				}
//
//				if (arr0[i][j] == 0) {
//					System.out.printf("\t");
//				} else {
//					System.out.printf("%2d \t", arr0[i][j]);
//				}
//			}
//			System.out.println();
//		}

		// 2-1
//		String[][] arr0 = new String[5][5];
//		String star = "*";
//
//		for(int i = 0; i < arr0.length; i++) {
//			for(int j = 0; j < arr0[i].length; j ++) {
//				arr0[i][j] = star;
//
//				System.out.print(" " + arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 2-2
//		String[][] arr0 = new String[5][];
//		String star = "*";
//
//		for(int i = 0; i < arr0.length; i++) {
//			arr0[i] = new String[i+1];
//			for(int j = 0; j < arr0[i].length; j++) {
//				arr0[i][j] = "*";
//
//				System.out.print(" " + arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 2-3
//		String[][] arr0 = new String[5][5];
//		String star = "*";
//
//		for(int i = 0; i < arr0.length; i++) {
//			for(int j = 4; j>=0; j--) { 
//				if (i < j) {
//					arr0[i][j] = " ";
//				}
//				else {
//					arr0[i][j] = star;
//				}
//				System.out.print(" " + arr0[i][j]);
//			}
//			System.out.println();
//		}

		// 2-4
//		String[][] arr0 = new String[5][5];
//		String star = "*";
//
//		for(int i = 0; i < arr0.length; i++) {
//			for(int j = 4; j>=0; j--) {
//				if (i < j) {
//					arr0[i][j] = " ";
//				}
//				else {
//					arr0[i][j] = star;
//				}
//				System.out.print(" " + arr0[i][j]);
//			}
//			for(int k = 0; k<i; k++) {
//
//				arr0[i][k] = star;
//
//				System.out.print(" " + arr0[i][k]);
//			}
//			System.out.println();
//		}

		// 2-5
		String[][] arr0 = new String[5][5];
		String star = "*";

		// 위에 부분
		for(int i = 0; i < arr0.length; i++) {
			for(int j = 4; j>=0; j--) {
				if (i < j) {
					arr0[i][j] = " ";
				}
				else {
					arr0[i][j] = star;
				}
				System.out.print(" " + arr0[i][j]);
			}
			for(int k = 0; k<i; k++) {

				arr0[i][k] = star;

				System.out.print(" " + arr0[i][k]);
			}
			System.out.println();
		}
		// 밑에 부분
		for (int i =0; i<arr0.length; i++) {
			for(int j = 0; j < arr0[i].length; j++) {
				if(i<j) {
					arr0[i][j] = star;
				}
				else {
					arr0[i][j] = " ";
				}

				System.out.print(" " + arr0[i][j]);
			}
			for(int k = 4; k-1 > i; k--) {
				arr0[i][k] = star;

				System.out.print(" " + arr0[i][k]);
			}
			System.out.println();
		}


	}

}
