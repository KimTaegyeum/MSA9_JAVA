package Day03;

import java.util.Scanner;

public class Ex07_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		
		switch (num % 5) {
		case 0: 
		case 1: System.out.println("*"); 	
				break;

		default:System.out.println("**");
			break;
		}
	}
}
