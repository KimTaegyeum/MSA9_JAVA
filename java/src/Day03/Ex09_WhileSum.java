package Day03;

public class Ex09_WhileSum {
	public static void main(String[] args) {
		
		
		int a = 1;
		int sum = 0;
		
		// a : 1 2 3 4.... 1000
		// sum = sum + a 	:???
		
		while( a <= 1000) {
			sum = sum + a;
			//방법 1
			//a = a + 1;
			//방법 2
			//sum = sum + a++;
			//방법 3
			sum += a++;
			
		}
		System.out.println("합계 : " + sum);
	}
}
