package kosa.basic;

public class CallByExam {

	// 값에 의한 호출
//	public static int change(int num) { // int num 매개 변수도 지역변수이기때문에 중괄호 안에서만 사용 가능 함 
//		num += 10;
//		
//		return num;
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num = 10;
//		num = change(num);  
//		
//		System.out.println(num);
//		
//	}
	   //call by reference (주소 값을 가지기 때문에 같은 곳을 참조하고 있음(return 필요 없이 값이 변경)) - 배열, 객체에 적용 즉, 참조형에 해당
	   public static void change2(int brr[]) { 
			brr[0] = 200;
		}
		
		public static void main(String[] args) {
			int arr[] = {100};
			change2(arr);
			System.out.println(arr[0]);
			
//			int arr[] = {1,2,3};
//			int brr[] = arr;
//			
//			brr[0] = 100;
//			System.out.println(arr[0]);
			
			
		}

}
