package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// 배열 내용 정렬
		
		int arr[] = {3, 2, 5};
		
		System.out.println(Arrays.toString(arr));  // 데이터를 문자열을 출력
		
		Arrays.sort(arr);  // sort는 오름 차순 정렬을 해주는 Api 이다.
		System.out.println(Arrays.toString(arr));
		
		//내림차순 (for문)
//		for (int i = 2; i >= 0; i--) {
//			Arrays.sort(arr);
//			
//			System.out.print(" " + arr[i]);
//		}
		
		for(int i=0; i <arr.length; i ++) {
			System.out.print(arr[arr.length-1-i] + ",");
		}
		
		System.out.println();
		
		int arr2[][] = {{2,90},{1,60},{3,20}}; // [3][2]
		Arrays.sort(arr2, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				//정렬기준 작성 => 2차원 배열 안에 1차원 첫번째 인덱스를 기준으로 오름차순(내림차순도 가능)
				if(o1[0] < o2[0]) {
					return -1; // 자리를 안 바꿔도 된다.
				}
				else if(o1[0] > o2[0]) {
					return 1; // 앞이 더 클 경우
				}
				else {
					return 0;
				}
				
			}
			
		});
		
		System.out.print(Arrays.deepToString(arr2));  // 2차원 배열은  deepToString
		
		
	}

}
