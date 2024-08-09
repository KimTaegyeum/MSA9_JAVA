package Day03;

public class Ex12_For {
	public static void main(String[] args) {
		// for(1초기식 ; 2조건식 ; 4증감식){ 3실행문 }
		// -실행 순서 : 1->반복(2->3->4)
		
		// 1. 1~10까지 정수를 출력하시오
		for (int a = 1; a <= 10; a++) {
			System.out.println(a + "");
		}
		System.out.println();
		
		for (int a = 50; a <= 100; a++) {
			System.out.println(a + "");
			if((a+1)%10==0)
				System.out.println();
		}
		System.out.println();
		
		for (int a = 2; a <=20 ; a+=2) {
			System.out.println(a);
		}
		System.out.println();
		
		
		for (int a = 1; a <=20 ; a+=2) {
			System.out.println(a);
		}
		System.out.println();
	}
}
