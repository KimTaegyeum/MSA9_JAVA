package Day03;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
			if(num % 2 ==1) 
				System.out.println("홀수입니다.");
				
			if(num % 2 ==0) 
				System.out.println("짝수입니다.");
				
				sc.close();
	}
}
