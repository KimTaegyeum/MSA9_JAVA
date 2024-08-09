package Day04;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 N을 입력받고.
		// 둘째줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중 , 최댓값을 구하시오
		// (입력 예시)
		// 5 
		// 90 60 70 100 55
		// (출력)
		// 최댓값 : 100
		
		/*
		 * 	(순서도)
		 *  1. 정수 하나 입력 받아서 N에 대입
		 *  2. N번 만큼 N개의 정수 입력 받아서 배열 arr에 대입
		 *  3. 배열을 반복해서 최댓값 max 배열의 i번째 요소와 비교
		 *  4. 두 요소 중에서 더 큰 요소를 max에 대입
		 *  5. 반복 끝나고, max 를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int j = 0; j < arr.length; j++) {
			if ( max < arr[j]) {
				max = arr[j];
			}
		}
		
		System.out.println("최댓값 : " + max);
		sc.close();
	}
}
