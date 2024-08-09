package Day01;

// import : 외부 클래스 포함시키는 키워드
// * import 패키지.클래스명;

import java.util.Scanner;

// import 하는법
// 1. 클래스|       : ctrl + space
// 2. 전체 import   : ctrl + shift + o

public class Ex03_scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("a : ");
	
		int a = sc.nextInt();

		
		System.out.println("a : " + a);

		
		
		
		sc.close();
		//sc.nextInt();
		
	}
}
