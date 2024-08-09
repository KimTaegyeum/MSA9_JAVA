package Day04;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		// 첫번째 줄에 입력할 개수 N을 입력받고.
		// 둘째줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중 , 최댓값을 구하시오
		// (입력 예시)
		// 5 
		// 90 60 70 100 55
		// (출력)
		// 최솟값 : 55
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int j = 0; j < arr.length; j++) {
			if ( min > arr[j]) {
				min = arr[j];
			}
		}
		
		System.out.println("최솟값 : " + min);
		sc.close();
	}
}
